package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IDoubleKeyFrameStatics.ABI::class)
@Signature("{0e56914c-b430-538f-bb66-0b8e83ab3db6}")
@Guid("0e56914cb430538fbb660b8e83ab3db6")
@WinRTInterface("0e56914cb430538fbb660b8e83ab3db6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleKeyFrameStatics.ByReference::class)
public interface IDoubleKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_KeyTimeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleKeyFrameStatics> {
    public override fun getValue() = ABI.makeIDoubleKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IDoubleKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleKeyFrameStatics {
    public val __2112015765_Ptr: Pointer?

    public val _2112015765_VtblPtr: Pointer?
      get() = __2112015765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _2112015765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112015765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyTimeProperty(): DependencyProperty? {
      val fnPtr = _2112015765_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112015765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDoubleKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2112015765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e56914cb430538fbb660b8e83ab3db6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleKeyFrameStatics(ptr: Pointer?): WithDefault =
        IDoubleKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeIDoubleKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IDoubleKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2112015765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleKeyFrameStatics): Array<IDoubleKeyFrameStatics?> =
        (elements as
        Array<IDoubleKeyFrameStatics?>).castToImpl<IDoubleKeyFrameStatics,IDoubleKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleKeyFrameStatics?> =
        arrayOfNulls<IDoubleKeyFrameStatics_Impl>(size) as Array<IDoubleKeyFrameStatics?>
  }
}
