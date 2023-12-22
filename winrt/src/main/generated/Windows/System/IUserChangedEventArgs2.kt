package Windows.System

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserChangedEventArgs2.ABI::class)
@Signature("{6b2ccb44-6f01-560c-97ad-fc7f32ec581f}")
@Guid("6b2ccb446f01560c97adfc7f32ec581f")
@WinRTInterface("6b2ccb446f01560c97adfc7f32ec581f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserChangedEventArgs2.ByReference::class)
public interface IUserChangedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangedPropertyKinds(): IVectorView<UserWatcherUpdateKind?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserChangedEventArgs2> {
    public override fun getValue() = ABI.makeIUserChangedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IUserChangedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserChangedEventArgs2 {
    public val __2090864053_Ptr: Pointer?

    public val _2090864053_VtblPtr: Pointer?
      get() = __2090864053_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangedPropertyKinds(): IVectorView<UserWatcherUpdateKind?>? {
      val fnPtr = _2090864053_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UserWatcherUpdateKind?>>()
      val hr = fn.invokeHR(arrayOf(__2090864053_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UserWatcherUpdateKind?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserChangedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2090864053_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserChangedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b2ccb446f01560c97adfc7f32ec581f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserChangedEventArgs2(ptr: Pointer?): WithDefault =
        IUserChangedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserChangedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIUserChangedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IUserChangedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2090864053_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserChangedEventArgs2): Array<IUserChangedEventArgs2?> =
        (elements as
        Array<IUserChangedEventArgs2?>).castToImpl<IUserChangedEventArgs2,IUserChangedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserChangedEventArgs2?> =
        arrayOfNulls<IUserChangedEventArgs2_Impl>(size) as Array<IUserChangedEventArgs2?>
  }
}
