package Windows.ApplicationModel.Wallet

import Windows.Devices.Geolocation.BasicGeoposition
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

@ABIMarker(IWalletRelevantLocation.ABI::class)
@Signature("{9fd8782a-e3f9-4de1-bab3-bb192e46b3f3}")
@Guid("9fd8782ae3f94de1bab3bb192e46b3f3")
@WinRTInterface("9fd8782ae3f94de1bab3bb192e46b3f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWalletRelevantLocation.ByReference::class)
public interface IWalletRelevantLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Position(): BasicGeoposition?

  @InterfaceMethod(1)
  public fun put_Position(value: BasicGeoposition?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayMessage(): String?

  @InterfaceMethod(3)
  public fun put_DisplayMessage(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWalletRelevantLocation> {
    public override fun getValue() = ABI.makeIWalletRelevantLocation(pointer.getPointer(0))

    public fun setValue(value: IWalletRelevantLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWalletRelevantLocation {
    public val __391691631_Ptr: Pointer?

    public val _391691631_VtblPtr: Pointer?
      get() = __391691631_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Position(): BasicGeoposition? {
      val fnPtr = _391691631_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicGeoposition>()
      val hr = fn.invokeHR(arrayOf(__391691631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicGeoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Position(value: BasicGeoposition?): Unit {
      val fnPtr = _391691631_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__391691631_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayMessage(): String? {
      val fnPtr = _391691631_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__391691631_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DisplayMessage(value: String?): Unit {
      val fnPtr = _391691631_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__391691631_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWalletRelevantLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __391691631_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWalletRelevantLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fd8782ae3f94de1bab3bb192e46b3f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWalletRelevantLocation(ptr: Pointer?): WithDefault =
        IWalletRelevantLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWalletRelevantLocation {
      val address = segment.toRawLongValue()
      return makeIWalletRelevantLocation(Pointer(address))
    }

    public override fun toNative(obj: IWalletRelevantLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__391691631_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWalletRelevantLocation): Array<IWalletRelevantLocation?>
        = (elements as
        Array<IWalletRelevantLocation?>).castToImpl<IWalletRelevantLocation,IWalletRelevantLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWalletRelevantLocation?> =
        arrayOfNulls<IWalletRelevantLocation_Impl>(size) as Array<IWalletRelevantLocation?>
  }
}
