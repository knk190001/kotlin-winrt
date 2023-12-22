package Windows.UI.Xaml.Controls

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

@ABIMarker(IStackPanel.ABI::class)
@Signature("{b8ae8fe2-d641-4fd7-80b4-7439207d2798}")
@Guid("b8ae8fe2d6414fd780b47439207d2798")
@WinRTInterface("b8ae8fe2d6414fd780b47439207d2798")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStackPanel.ByReference::class)
public interface IStackPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreScrollSnapPointsRegular(): Boolean

  @InterfaceMethod(1)
  public fun put_AreScrollSnapPointsRegular(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(3)
  public fun put_Orientation(value: Orientation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStackPanel> {
    public override fun getValue() = ABI.makeIStackPanel(pointer.getPointer(0))

    public fun setValue(value: IStackPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStackPanel {
    public val __499488120_Ptr: Pointer?

    public val _499488120_VtblPtr: Pointer?
      get() = __499488120_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreScrollSnapPointsRegular(): Boolean {
      val fnPtr = _499488120_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__499488120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AreScrollSnapPointsRegular(value: Boolean): Unit {
      val fnPtr = _499488120_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__499488120_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _499488120_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__499488120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _499488120_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__499488120_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStackPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __499488120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStackPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8ae8fe2d6414fd780b47439207d2798")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStackPanel(ptr: Pointer?): WithDefault = IStackPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStackPanel {
      val address = segment.toRawLongValue()
      return makeIStackPanel(Pointer(address))
    }

    public override fun toNative(obj: IStackPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__499488120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStackPanel): Array<IStackPanel?> = (elements as
        Array<IStackPanel?>).castToImpl<IStackPanel,IStackPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStackPanel?> =
        arrayOfNulls<IStackPanel_Impl>(size) as Array<IStackPanel?>
  }
}
