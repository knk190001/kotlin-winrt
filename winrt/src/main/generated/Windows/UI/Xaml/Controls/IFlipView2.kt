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

@ABIMarker(IFlipView2.ABI::class)
@Signature("{c4fea4fd-7af3-4952-9fd9-9e0987fc4f29}")
@Guid("c4fea4fd7af349529fd99e0987fc4f29")
@WinRTInterface("c4fea4fd7af349529fd99e0987fc4f29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipView2.ByReference::class)
public interface IFlipView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UseTouchAnimationsForAllNavigation(): Boolean

  @InterfaceMethod(1)
  public fun put_UseTouchAnimationsForAllNavigation(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlipView2> {
    public override fun getValue() = ABI.makeIFlipView2(pointer.getPointer(0))

    public fun setValue(value: IFlipView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipView2 {
    public val __709957340_Ptr: Pointer?

    public val _709957340_VtblPtr: Pointer?
      get() = __709957340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UseTouchAnimationsForAllNavigation(): Boolean {
      val fnPtr = _709957340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__709957340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_UseTouchAnimationsForAllNavigation(value: Boolean): Unit {
      val fnPtr = _709957340_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__709957340_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlipView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __709957340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4fea4fd7af349529fd99e0987fc4f29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipView2(ptr: Pointer?): WithDefault = IFlipView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipView2 {
      val address = segment.toRawLongValue()
      return makeIFlipView2(Pointer(address))
    }

    public override fun toNative(obj: IFlipView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__709957340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipView2): Array<IFlipView2?> = (elements as
        Array<IFlipView2?>).castToImpl<IFlipView2,IFlipView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipView2?> = arrayOfNulls<IFlipView2_Impl>(size)
        as Array<IFlipView2?>
  }
}
