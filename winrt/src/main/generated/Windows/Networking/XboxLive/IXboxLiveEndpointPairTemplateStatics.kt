package Windows.Networking.XboxLive

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveEndpointPairTemplateStatics.ABI::class)
@Signature("{1e13137b-737b-4a23-bc64-0870f75655ba}")
@Guid("1e13137b737b4a23bc640870f75655ba")
@WinRTInterface("1e13137b737b4a23bc640870f75655ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveEndpointPairTemplateStatics.ByReference::class)
public interface IXboxLiveEndpointPairTemplateStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTemplateByName(name: String?): XboxLiveEndpointPairTemplate?

  @InterfaceMethod(1)
  public fun get_Templates(): IVectorView<XboxLiveEndpointPairTemplate?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveEndpointPairTemplateStatics> {
    public override fun getValue() =
        ABI.makeIXboxLiveEndpointPairTemplateStatics(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveEndpointPairTemplateStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveEndpointPairTemplateStatics {
    public val __789749250_Ptr: Pointer?

    public val _789749250_VtblPtr: Pointer?
      get() = __789749250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTemplateByName(name: String?): XboxLiveEndpointPairTemplate? {
      val fnPtr = _789749250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveEndpointPairTemplate>()
      val hr = fn.invokeHR(arrayOf(__789749250_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveEndpointPairTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Templates(): IVectorView<XboxLiveEndpointPairTemplate?>? {
      val fnPtr = _789749250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<XboxLiveEndpointPairTemplate?>>()
      val hr = fn.invokeHR(arrayOf(__789749250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<XboxLiveEndpointPairTemplate?>>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveEndpointPairTemplateStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __789749250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveEndpointPairTemplateStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e13137b737b4a23bc640870f75655ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveEndpointPairTemplateStatics(ptr: Pointer?): WithDefault =
        IXboxLiveEndpointPairTemplateStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveEndpointPairTemplateStatics {
      val address = segment.toRawLongValue()
      return makeIXboxLiveEndpointPairTemplateStatics(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveEndpointPairTemplateStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__789749250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveEndpointPairTemplateStatics):
        Array<IXboxLiveEndpointPairTemplateStatics?> = (elements as
        Array<IXboxLiveEndpointPairTemplateStatics?>).castToImpl<IXboxLiveEndpointPairTemplateStatics,IXboxLiveEndpointPairTemplateStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveEndpointPairTemplateStatics?> =
        arrayOfNulls<IXboxLiveEndpointPairTemplateStatics_Impl>(size) as
        Array<IXboxLiveEndpointPairTemplateStatics?>
  }
}
