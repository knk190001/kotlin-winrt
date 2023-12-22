package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IRowDefinitionStatics.ABI::class)
@Signature("{7317c7c5-fd6f-58d9-9b53-4978dbacde23}")
@Guid("7317c7c5fd6f58d99b534978dbacde23")
@WinRTInterface("7317c7c5fd6f58d99b534978dbacde23")
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
    public val __1315723137_Ptr: Pointer?

    public val _1315723137_VtblPtr: Pointer?
      get() = __1315723137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeightProperty(): DependencyProperty? {
      val fnPtr = _1315723137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1315723137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxHeightProperty(): DependencyProperty? {
      val fnPtr = _1315723137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1315723137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MinHeightProperty(): DependencyProperty? {
      val fnPtr = _1315723137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1315723137_Ptr,  result))
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
    public override val __1315723137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRowDefinitionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7317c7c5fd6f58d99b534978dbacde23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRowDefinitionStatics(ptr: Pointer?): WithDefault =
        IRowDefinitionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRowDefinitionStatics {
      val address = segment.toRawLongValue()
      return makeIRowDefinitionStatics(Pointer(address))
    }

    public override fun toNative(obj: IRowDefinitionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1315723137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRowDefinitionStatics): Array<IRowDefinitionStatics?> =
        (elements as
        Array<IRowDefinitionStatics?>).castToImpl<IRowDefinitionStatics,IRowDefinitionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRowDefinitionStatics?> =
        arrayOfNulls<IRowDefinitionStatics_Impl>(size) as Array<IRowDefinitionStatics?>
  }
}
