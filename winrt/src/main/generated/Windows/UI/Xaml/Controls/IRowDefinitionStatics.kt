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

@ABIMarker(IRowDefinitionStatics.ABI::class)
@Signature("{5adf3fe5-2056-4724-94d6-e4812b022ec8}")
@Guid("5adf3fe52056472494d6e4812b022ec8")
@WinRTInterface("5adf3fe52056472494d6e4812b022ec8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRowDefinitionStatics.ByReference::class)
public interface IRowDefinitionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeightProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MaxHeightProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MinHeightProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRowDefinitionStatics> {
    public override fun getValue() = ABI.makeIRowDefinitionStatics(pointer.getPointer(0))

    public fun setValue(value: IRowDefinitionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRowDefinitionStatics {
    public val __608126380_Ptr: Pointer?

    public val _608126380_VtblPtr: Pointer?
      get() = __608126380_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeightProperty(): DependencyProperty? {
      val fnPtr = _608126380_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__608126380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxHeightProperty(): DependencyProperty? {
      val fnPtr = _608126380_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__608126380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinHeightProperty(): DependencyProperty? {
      val fnPtr = _608126380_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__608126380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRowDefinitionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __608126380_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRowDefinitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5adf3fe52056472494d6e4812b022ec8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRowDefinitionStatics(ptr: Pointer?): WithDefault =
        IRowDefinitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRowDefinitionStatics {
      val address = segment.toRawLongValue()
      return makeIRowDefinitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IRowDefinitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__608126380_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRowDefinitionStatics): Array<IRowDefinitionStatics?> =
        (elements as
        Array<IRowDefinitionStatics?>).castToImpl<IRowDefinitionStatics,IRowDefinitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRowDefinitionStatics?> =
        arrayOfNulls<IRowDefinitionStatics_Impl>(size) as Array<IRowDefinitionStatics?>
  }
}
