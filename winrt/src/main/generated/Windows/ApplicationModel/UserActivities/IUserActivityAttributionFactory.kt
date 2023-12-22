package Windows.ApplicationModel.UserActivities

import Windows.Foundation.Uri
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

@ABIMarker(IUserActivityAttributionFactory.ABI::class)
@Signature("{e62bd252-c566-4f42-9974-916c4d76377e}")
@Guid("e62bd252c5664f429974916c4d76377e")
@WinRTInterface("e62bd252c5664f429974916c4d76377e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityAttributionFactory.ByReference::class)
public interface IUserActivityAttributionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithUri(iconUri: Uri?): UserActivityAttribution?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityAttributionFactory> {
    public override fun getValue() = ABI.makeIUserActivityAttributionFactory(pointer.getPointer(0))

    public fun setValue(value: IUserActivityAttributionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityAttributionFactory {
    public val __1165768148_Ptr: Pointer?

    public val _1165768148_VtblPtr: Pointer?
      get() = __1165768148_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithUri(iconUri: Uri?): UserActivityAttribution? {
      val fnPtr = _1165768148_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityAttribution>()
      val hr = fn.invokeHR(arrayOf(__1165768148_Ptr, marshalToNative(iconUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityAttribution>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityAttributionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1165768148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityAttributionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e62bd252c5664f429974916c4d76377e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityAttributionFactory(ptr: Pointer?): WithDefault =
        IUserActivityAttributionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityAttributionFactory {
      val address = segment.toRawLongValue()
      return makeIUserActivityAttributionFactory(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityAttributionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1165768148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityAttributionFactory):
        Array<IUserActivityAttributionFactory?> = (elements as
        Array<IUserActivityAttributionFactory?>).castToImpl<IUserActivityAttributionFactory,IUserActivityAttributionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityAttributionFactory?> =
        arrayOfNulls<IUserActivityAttributionFactory_Impl>(size) as
        Array<IUserActivityAttributionFactory?>
  }
}
