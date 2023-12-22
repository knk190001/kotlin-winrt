package Windows.Graphics.Display

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayInformationStatics.ABI::class)
@Signature("{c6a02a6c-d452-44dc-ba07-96f3c6adf9d1}")
@Guid("c6a02a6cd45244dcba0796f3c6adf9d1")
@WinRTInterface("c6a02a6cd45244dcba0796f3c6adf9d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformationStatics.ByReference::class)
public interface IDisplayInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): DisplayInformation?

  @InterfaceMethod(1)
  public fun get_AutoRotationPreferences(): DisplayOrientations?

  @InterfaceMethod(2)
  public fun put_AutoRotationPreferences(value: DisplayOrientations?): Unit

  @InterfaceMethod(3)
  public fun add_DisplayContentsInvalidated(handler: TypedEventHandler<DisplayInformation?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_DisplayContentsInvalidated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformationStatics> {
    public override fun getValue() = ABI.makeIDisplayInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformationStatics {
    public val __1804438812_Ptr: Pointer?

    public val _1804438812_VtblPtr: Pointer?
      get() = __1804438812_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): DisplayInformation? {
      val fnPtr = _1804438812_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayInformation>()
      val hr = fn.invokeHR(arrayOf(__1804438812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AutoRotationPreferences(): DisplayOrientations? {
      val fnPtr = _1804438812_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__1804438812_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AutoRotationPreferences(value: DisplayOrientations?): Unit {
      val fnPtr = _1804438812_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1804438812_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_DisplayContentsInvalidated(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1804438812_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1804438812_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_DisplayContentsInvalidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1804438812_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1804438812_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1804438812_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6a02a6cd45244dcba0796f3c6adf9d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformationStatics(ptr: Pointer?): WithDefault =
        IDisplayInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformationStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1804438812_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformationStatics):
        Array<IDisplayInformationStatics?> = (elements as
        Array<IDisplayInformationStatics?>).castToImpl<IDisplayInformationStatics,IDisplayInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformationStatics?> =
        arrayOfNulls<IDisplayInformationStatics_Impl>(size) as Array<IDisplayInformationStatics?>
  }
}
