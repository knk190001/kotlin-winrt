package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.CornerRadius
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Thickness
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

@ABIMarker(IRelativePanel.ABI::class)
@Signature("{2eabfaeb-b35a-4035-acea-3c4a3730683f}")
@Guid("2eabfaebb35a4035acea3c4a3730683f")
@WinRTInterface("2eabfaebb35a4035acea3c4a3730683f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRelativePanel.ByReference::class)
public interface IRelativePanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BorderBrush(): Brush?

  @InterfaceMethod(1)
  public fun put_BorderBrush(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_BorderThickness(): Thickness?

  @InterfaceMethod(3)
  public fun put_BorderThickness(value: Thickness?): Unit

  @InterfaceMethod(4)
  public fun get_CornerRadius(): CornerRadius?

  @InterfaceMethod(5)
  public fun put_CornerRadius(value: CornerRadius?): Unit

  @InterfaceMethod(6)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(7)
  public fun put_Padding(value: Thickness?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRelativePanel>
      {
    public override fun getValue() = ABI.makeIRelativePanel(pointer.getPointer(0))

    public fun setValue(value: IRelativePanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRelativePanel {
    public val __1361260540_Ptr: Pointer?

    public val _1361260540_VtblPtr: Pointer?
      get() = __1361260540_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BorderBrush(): Brush? {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_BorderBrush(value: Brush?): Unit {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BorderThickness(): Thickness? {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BorderThickness(value: Thickness?): Unit {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CornerRadius(): CornerRadius? {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CornerRadius>()
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CornerRadius>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_CornerRadius(value: CornerRadius?): Unit {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _1361260540_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1361260540_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRelativePanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1361260540_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRelativePanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2eabfaebb35a4035acea3c4a3730683f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRelativePanel(ptr: Pointer?): WithDefault = IRelativePanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRelativePanel {
      val address = segment.toRawLongValue()
      return makeIRelativePanel(Pointer(address))
    }

    public override fun toNative(obj: IRelativePanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1361260540_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRelativePanel): Array<IRelativePanel?> = (elements as
        Array<IRelativePanel?>).castToImpl<IRelativePanel,IRelativePanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRelativePanel?> =
        arrayOfNulls<IRelativePanel_Impl>(size) as Array<IRelativePanel?>
  }
}
