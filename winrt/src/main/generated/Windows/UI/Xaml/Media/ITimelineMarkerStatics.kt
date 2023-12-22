package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ITimelineMarkerStatics.ABI::class)
@Signature("{c4aef0c6-16a3-484b-87f5-6528b8f04a47}")
@Guid("c4aef0c616a3484b87f56528b8f04a47")
@WinRTInterface("c4aef0c616a3484b87f56528b8f04a47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimelineMarkerStatics.ByReference::class)
public interface ITimelineMarkerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TimeProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TypeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_TextProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimelineMarkerStatics> {
    public override fun getValue() = ABI.makeITimelineMarkerStatics(pointer.getPointer(0))

    public fun setValue(value: ITimelineMarkerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimelineMarkerStatics {
    public val __694157038_Ptr: Pointer?

    public val _694157038_VtblPtr: Pointer?
      get() = __694157038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TimeProperty(): DependencyProperty? {
      val fnPtr = _694157038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__694157038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TypeProperty(): DependencyProperty? {
      val fnPtr = _694157038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__694157038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TextProperty(): DependencyProperty? {
      val fnPtr = _694157038_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__694157038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITimelineMarkerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __694157038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimelineMarkerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4aef0c616a3484b87f56528b8f04a47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimelineMarkerStatics(ptr: Pointer?): WithDefault =
        ITimelineMarkerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimelineMarkerStatics {
      val address = segment.toRawLongValue()
      return makeITimelineMarkerStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimelineMarkerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__694157038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimelineMarkerStatics): Array<ITimelineMarkerStatics?> =
        (elements as
        Array<ITimelineMarkerStatics?>).castToImpl<ITimelineMarkerStatics,ITimelineMarkerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimelineMarkerStatics?> =
        arrayOfNulls<ITimelineMarkerStatics_Impl>(size) as Array<ITimelineMarkerStatics?>
  }
}
