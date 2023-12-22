package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IMapView
import Windows.Media.MediaProperties.MediaEncodingProfile
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IChatMessageTransportConfiguration.ABI::class)
@Signature("{879ff725-1a08-4aca-a075-3355126312e6}")
@Guid("879ff7251a084acaa0753355126312e6")
@WinRTInterface("879ff7251a084acaa0753355126312e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageTransportConfiguration.ByReference::class)
public interface IChatMessageTransportConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxAttachmentCount(): Int

  @InterfaceMethod(1)
  public fun get_MaxMessageSizeInKilobytes(): Int

  @InterfaceMethod(2)
  public fun get_MaxRecipientCount(): Int

  @InterfaceMethod(3)
  public fun get_SupportedVideoFormat(): MediaEncodingProfile?

  @InterfaceMethod(4)
  public fun get_ExtendedProperties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageTransportConfiguration> {
    public override fun getValue() =
        ABI.makeIChatMessageTransportConfiguration(pointer.getPointer(0))

    public fun setValue(value: IChatMessageTransportConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageTransportConfiguration {
    public val __2129444843_Ptr: Pointer?

    public val _2129444843_VtblPtr: Pointer?
      get() = __2129444843_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxAttachmentCount(): Int {
      val fnPtr = _2129444843_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129444843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MaxMessageSizeInKilobytes(): Int {
      val fnPtr = _2129444843_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129444843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxRecipientCount(): Int {
      val fnPtr = _2129444843_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129444843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SupportedVideoFormat(): MediaEncodingProfile? {
      val fnPtr = _2129444843_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__2129444843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ExtendedProperties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _2129444843_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__2129444843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageTransportConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129444843_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageTransportConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("879ff7251a084acaa0753355126312e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageTransportConfiguration(ptr: Pointer?): WithDefault =
        IChatMessageTransportConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageTransportConfiguration {
      val address = segment.toRawLongValue()
      return makeIChatMessageTransportConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageTransportConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129444843_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageTransportConfiguration):
        Array<IChatMessageTransportConfiguration?> = (elements as
        Array<IChatMessageTransportConfiguration?>).castToImpl<IChatMessageTransportConfiguration,IChatMessageTransportConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageTransportConfiguration?> =
        arrayOfNulls<IChatMessageTransportConfiguration_Impl>(size) as
        Array<IChatMessageTransportConfiguration?>
  }
}
