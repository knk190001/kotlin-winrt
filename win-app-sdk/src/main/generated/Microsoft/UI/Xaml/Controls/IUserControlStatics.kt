package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IUserControlStatics.ABI::class)
@Signature("{575e8fa1-2e2d-5857-9a93-6b11e54316ba}")
@Guid("575e8fa12e2d58579a936b11e54316ba")
@WinRTInterface("575e8fa12e2d58579a936b11e54316ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserControlStatics.ByReference::class)
public interface IUserControlStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserControlStatics> {
    public override fun getValue() = ABI.makeIUserControlStatics(pointer.getPointer(0))

    public fun setValue(value: IUserControlStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserControlStatics {
    public val __36494758_Ptr: Pointer?

    public val _36494758_VtblPtr: Pointer?
      get() = __36494758_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _36494758_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__36494758_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IUserControlStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __36494758_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserControlStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("575e8fa12e2d58579a936b11e54316ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserControlStatics(ptr: Pointer?): WithDefault = IUserControlStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserControlStatics {
      val address = segment.toRawLongValue()
      return makeIUserControlStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserControlStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__36494758_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserControlStatics): Array<IUserControlStatics?> =
        (elements as
        Array<IUserControlStatics?>).castToImpl<IUserControlStatics,IUserControlStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserControlStatics?> =
        arrayOfNulls<IUserControlStatics_Impl>(size) as Array<IUserControlStatics?>
  }
}
