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

@ABIMarker(IPanelStatics.ABI::class)
@Signature("{76a9caa7-a5d4-5061-a325-17c76f66de51}")
@Guid("76a9caa7a5d45061a32517c76f66de51")
@WinRTInterface("76a9caa7a5d45061a32517c76f66de51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPanelStatics.ByReference::class)
public interface IPanelStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackgroundProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsItemsHostProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ChildrenTransitionsProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPanelStatics>
      {
    public override fun getValue() = ABI.makeIPanelStatics(pointer.getPointer(0))

    public fun setValue(value: IPanelStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPanelStatics {
    public val __1125622680_Ptr: Pointer?

    public val _1125622680_VtblPtr: Pointer?
      get() = __1125622680_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackgroundProperty(): DependencyProperty? {
      val fnPtr = _1125622680_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1125622680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsItemsHostProperty(): DependencyProperty? {
      val fnPtr = _1125622680_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1125622680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ChildrenTransitionsProperty(): DependencyProperty? {
      val fnPtr = _1125622680_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1125622680_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPanelStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1125622680_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPanelStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76a9caa7a5d45061a32517c76f66de51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPanelStatics(ptr: Pointer?): WithDefault = IPanelStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPanelStatics {
      val address = segment.toRawLongValue()
      return makeIPanelStatics(Pointer(address))
    }

    public override fun toNative(obj: IPanelStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1125622680_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPanelStatics): Array<IPanelStatics?> = (elements as
        Array<IPanelStatics?>).castToImpl<IPanelStatics,IPanelStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPanelStatics?> =
        arrayOfNulls<IPanelStatics_Impl>(size) as Array<IPanelStatics?>
  }
}
