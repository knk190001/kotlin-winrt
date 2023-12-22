package Windows.ApplicationModel.AppService

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppServiceTriggerDetails.ABI::class)
@Signature("{88a2dcac-ad28-41b8-80bb-bdf1b2169e19}")
@Guid("88a2dcacad2841b880bbbdf1b2169e19")
@WinRTInterface("88a2dcacad2841b880bbbdf1b2169e19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceTriggerDetails.ByReference::class)
public interface IAppServiceTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_CallerPackageFamilyName(): String?

  @InterfaceMethod(2)
  public fun get_AppServiceConnection(): AppServiceConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceTriggerDetails> {
    public override fun getValue() = ABI.makeIAppServiceTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IAppServiceTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceTriggerDetails {
    public val __876434071_Ptr: Pointer?

    public val _876434071_VtblPtr: Pointer?
      get() = __876434071_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _876434071_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__876434071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CallerPackageFamilyName(): String? {
      val fnPtr = _876434071_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__876434071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AppServiceConnection(): AppServiceConnection? {
      val fnPtr = _876434071_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppServiceConnection>()
      val hr = fn.invokeHR(arrayOf(__876434071_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppServiceConnection>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __876434071_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88a2dcacad2841b880bbbdf1b2169e19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceTriggerDetails(ptr: Pointer?): WithDefault =
        IAppServiceTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIAppServiceTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__876434071_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceTriggerDetails):
        Array<IAppServiceTriggerDetails?> = (elements as
        Array<IAppServiceTriggerDetails?>).castToImpl<IAppServiceTriggerDetails,IAppServiceTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceTriggerDetails?> =
        arrayOfNulls<IAppServiceTriggerDetails_Impl>(size) as Array<IAppServiceTriggerDetails?>
  }
}
