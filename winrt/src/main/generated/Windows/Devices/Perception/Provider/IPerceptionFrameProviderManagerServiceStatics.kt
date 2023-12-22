package Windows.Devices.Perception.Provider

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionFrameProviderManagerServiceStatics.ABI::class)
@Signature("{ae8386e6-cad9-4359-8f96-8eae51810526}")
@Guid("ae8386e6cad943598f968eae51810526")
@WinRTInterface("ae8386e6cad943598f968eae51810526")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionFrameProviderManagerServiceStatics.ByReference::class)
public interface IPerceptionFrameProviderManagerServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterFrameProviderInfo(manager: IPerceptionFrameProviderManager?,
      frameProviderInfo: PerceptionFrameProviderInfo?): Unit

  @InterfaceMethod(1)
  public fun UnregisterFrameProviderInfo(manager: IPerceptionFrameProviderManager?,
      frameProviderInfo: PerceptionFrameProviderInfo?): Unit

  @InterfaceMethod(2)
  public fun RegisterFaceAuthenticationGroup(manager: IPerceptionFrameProviderManager?,
      faceAuthenticationGroup: PerceptionFaceAuthenticationGroup?): Unit

  @InterfaceMethod(3)
  public fun UnregisterFaceAuthenticationGroup(manager: IPerceptionFrameProviderManager?,
      faceAuthenticationGroup: PerceptionFaceAuthenticationGroup?): Unit

  @InterfaceMethod(4)
  public fun RegisterControlGroup(manager: IPerceptionFrameProviderManager?,
      controlGroup: PerceptionControlGroup?): Unit

  @InterfaceMethod(5)
  public fun UnregisterControlGroup(manager: IPerceptionFrameProviderManager?,
      controlGroup: PerceptionControlGroup?): Unit

  @InterfaceMethod(6)
  public fun RegisterCorrelationGroup(manager: IPerceptionFrameProviderManager?,
      correlationGroup: PerceptionCorrelationGroup?): Unit

  @InterfaceMethod(7)
  public fun UnregisterCorrelationGroup(manager: IPerceptionFrameProviderManager?,
      correlationGroup: PerceptionCorrelationGroup?): Unit

  @InterfaceMethod(8)
  public fun UpdateAvailabilityForProvider(provider: IPerceptionFrameProvider?, available: Boolean):
      Unit

  @InterfaceMethod(9)
  public fun PublishFrameForProvider(provider: IPerceptionFrameProvider?, frame: PerceptionFrame?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionFrameProviderManagerServiceStatics> {
    public override fun getValue() =
        ABI.makeIPerceptionFrameProviderManagerServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IPerceptionFrameProviderManagerServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionFrameProviderManagerServiceStatics {
    public val __1569932879_Ptr: Pointer?

    public val _1569932879_VtblPtr: Pointer?
      get() = __1569932879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterFrameProviderInfo(manager: IPerceptionFrameProviderManager?,
        frameProviderInfo: PerceptionFrameProviderInfo?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(frameProviderInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun UnregisterFrameProviderInfo(manager: IPerceptionFrameProviderManager?,
        frameProviderInfo: PerceptionFrameProviderInfo?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(frameProviderInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun RegisterFaceAuthenticationGroup(manager: IPerceptionFrameProviderManager?,
        faceAuthenticationGroup: PerceptionFaceAuthenticationGroup?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(faceAuthenticationGroup),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun UnregisterFaceAuthenticationGroup(manager: IPerceptionFrameProviderManager?,
        faceAuthenticationGroup: PerceptionFaceAuthenticationGroup?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(faceAuthenticationGroup),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun RegisterControlGroup(manager: IPerceptionFrameProviderManager?,
        controlGroup: PerceptionControlGroup?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(controlGroup),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun UnregisterControlGroup(manager: IPerceptionFrameProviderManager?,
        controlGroup: PerceptionControlGroup?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(controlGroup),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun RegisterCorrelationGroup(manager: IPerceptionFrameProviderManager?,
        correlationGroup: PerceptionCorrelationGroup?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(correlationGroup),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun UnregisterCorrelationGroup(manager: IPerceptionFrameProviderManager?,
        correlationGroup: PerceptionCorrelationGroup?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(manager),
          marshalToNative(correlationGroup),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun UpdateAvailabilityForProvider(provider: IPerceptionFrameProvider?,
        available: Boolean): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(provider), available,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun PublishFrameForProvider(provider: IPerceptionFrameProvider?,
        frame: PerceptionFrame?): Unit {
      val fnPtr = _1569932879_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569932879_Ptr, marshalToNative(provider),
          marshalToNative(frame),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPerceptionFrameProviderManagerServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1569932879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionFrameProviderManagerServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae8386e6cad943598f968eae51810526")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionFrameProviderManagerServiceStatics(ptr: Pointer?): WithDefault =
        IPerceptionFrameProviderManagerServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionFrameProviderManagerServiceStatics {
      val address = segment.toRawLongValue()
      return makeIPerceptionFrameProviderManagerServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionFrameProviderManagerServiceStatics): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1569932879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionFrameProviderManagerServiceStatics):
        Array<IPerceptionFrameProviderManagerServiceStatics?> = (elements as
        Array<IPerceptionFrameProviderManagerServiceStatics?>).castToImpl<IPerceptionFrameProviderManagerServiceStatics,IPerceptionFrameProviderManagerServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionFrameProviderManagerServiceStatics?> =
        arrayOfNulls<IPerceptionFrameProviderManagerServiceStatics_Impl>(size) as
        Array<IPerceptionFrameProviderManagerServiceStatics?>
  }
}
