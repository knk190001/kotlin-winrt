package Windows.UI.Xaml.Controls

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

@ABIMarker(IRefreshVisualizerStatics.ABI::class)
@Signature("{afea56af-362a-4015-b155-733a1f869831}")
@Guid("afea56af362a4015b155733a1f869831")
@WinRTInterface("afea56af362a4015b155733a1f869831")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshVisualizerStatics.ByReference::class)
public interface IRefreshVisualizerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InfoProviderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OrientationProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ContentProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_StateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshVisualizerStatics> {
    public override fun getValue() = ABI.makeIRefreshVisualizerStatics(pointer.getPointer(0))

    public fun setValue(value: IRefreshVisualizerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshVisualizerStatics {
    public val __2107363448_Ptr: Pointer?

    public val _2107363448_VtblPtr: Pointer?
      get() = __2107363448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InfoProviderProperty(): DependencyProperty? {
      val fnPtr = _2107363448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2107363448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OrientationProperty(): DependencyProperty? {
      val fnPtr = _2107363448_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2107363448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _2107363448_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2107363448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_StateProperty(): DependencyProperty? {
      val fnPtr = _2107363448_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2107363448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRefreshVisualizerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2107363448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshVisualizerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afea56af362a4015b155733a1f869831")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshVisualizerStatics(ptr: Pointer?): WithDefault =
        IRefreshVisualizerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshVisualizerStatics {
      val address = segment.toRawLongValue()
      return makeIRefreshVisualizerStatics(Pointer(address))
    }

    public override fun toNative(obj: IRefreshVisualizerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2107363448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshVisualizerStatics):
        Array<IRefreshVisualizerStatics?> = (elements as
        Array<IRefreshVisualizerStatics?>).castToImpl<IRefreshVisualizerStatics,IRefreshVisualizerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshVisualizerStatics?> =
        arrayOfNulls<IRefreshVisualizerStatics_Impl>(size) as Array<IRefreshVisualizerStatics?>
  }
}
