package Windows.Devices.SmartCards

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncAction
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

@ABIMarker(ISmartCardAppletIdGroupRegistration2.ABI::class)
@Signature("{5f5508d8-98a7-4f2e-91d9-6cfcceda407f}")
@Guid("5f5508d898a74f2e91d96cfcceda407f")
@WinRTInterface("5f5508d898a74f2e91d96cfcceda407f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAppletIdGroupRegistration2.ByReference::class)
public interface ISmartCardAppletIdGroupRegistration2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SmartCardReaderId(): String?

  @InterfaceMethod(1)
  public fun SetPropertiesAsync(props: ValueSet?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAppletIdGroupRegistration2> {
    public override fun getValue() =
        ABI.makeISmartCardAppletIdGroupRegistration2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAppletIdGroupRegistration2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAppletIdGroupRegistration2 {
    public val __676916245_Ptr: Pointer?

    public val _676916245_VtblPtr: Pointer?
      get() = __676916245_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SmartCardReaderId(): String? {
      val fnPtr = _676916245_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__676916245_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPropertiesAsync(props: ValueSet?): IAsyncAction? {
      val fnPtr = _676916245_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__676916245_Ptr, marshalToNative(props), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardAppletIdGroupRegistration2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __676916245_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAppletIdGroupRegistration2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f5508d898a74f2e91d96cfcceda407f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAppletIdGroupRegistration2(ptr: Pointer?): WithDefault =
        ISmartCardAppletIdGroupRegistration2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAppletIdGroupRegistration2 {
      val address = segment.toRawLongValue()
      return makeISmartCardAppletIdGroupRegistration2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAppletIdGroupRegistration2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__676916245_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAppletIdGroupRegistration2):
        Array<ISmartCardAppletIdGroupRegistration2?> = (elements as
        Array<ISmartCardAppletIdGroupRegistration2?>).castToImpl<ISmartCardAppletIdGroupRegistration2,ISmartCardAppletIdGroupRegistration2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAppletIdGroupRegistration2?> =
        arrayOfNulls<ISmartCardAppletIdGroupRegistration2_Impl>(size) as
        Array<ISmartCardAppletIdGroupRegistration2?>
  }
}
