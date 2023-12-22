package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapLayerStatics.ABI::class)
@Signature("{9ca4a26b-5db9-4f0c-bdd5-b1bffdcce946}")
@Guid("9ca4a26b5db94f0cbdd5b1bffdcce946")
@WinRTInterface("9ca4a26b5db94f0cbdd5b1bffdcce946")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapLayerStatics.ByReference::class)
public interface IMapLayerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapTabIndexProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_VisibleProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ZIndexProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapLayerStatics> {
    public override fun getValue() = ABI.makeIMapLayerStatics(pointer.getPointer(0))

    public fun setValue(value: IMapLayerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapLayerStatics {
    public val __1167889601_Ptr: Pointer?

    public val _1167889601_VtblPtr: Pointer?
      get() = __1167889601_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapTabIndexProperty(): DependencyProperty? {
      val fnPtr = _1167889601_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1167889601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VisibleProperty(): DependencyProperty? {
      val fnPtr = _1167889601_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1167889601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ZIndexProperty(): DependencyProperty? {
      val fnPtr = _1167889601_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1167889601_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapLayerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1167889601_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapLayerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ca4a26b5db94f0cbdd5b1bffdcce946")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapLayerStatics(ptr: Pointer?): WithDefault = IMapLayerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapLayerStatics {
      val address = segment.toRawLongValue()
      return makeIMapLayerStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapLayerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1167889601_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapLayerStatics): Array<IMapLayerStatics?> = (elements as
        Array<IMapLayerStatics?>).castToImpl<IMapLayerStatics,IMapLayerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapLayerStatics?> =
        arrayOfNulls<IMapLayerStatics_Impl>(size) as Array<IMapLayerStatics?>
  }
}
