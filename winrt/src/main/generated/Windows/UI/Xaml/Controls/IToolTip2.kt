package Windows.UI.Xaml.Controls

import Windows.Foundation.IReference
import Windows.Foundation.Rect
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

@ABIMarker(IToolTip2.ABI::class)
@Signature("{2b1ade26-299a-5d54-800b-3bea123b4c20}")
@Guid("2b1ade26299a5d54800b3bea123b4c20")
@WinRTInterface("2b1ade26299a5d54800b3bea123b4c20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToolTip2.ByReference::class)
public interface IToolTip2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementRect(): IReference<Rect?>?

  @InterfaceMethod(1)
  public fun put_PlacementRect(value: IReference<Rect?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IToolTip2> {
    public override fun getValue() = ABI.makeIToolTip2(pointer.getPointer(0))

    public fun setValue(value: IToolTip2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToolTip2 {
    public val __1472322357_Ptr: Pointer?

    public val _1472322357_VtblPtr: Pointer?
      get() = __1472322357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementRect(): IReference<Rect?>? {
      val fnPtr = _1472322357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Rect?>>()
      val hr = fn.invokeHR(arrayOf(__1472322357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Rect?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlacementRect(value: IReference<Rect?>?): Unit {
      val fnPtr = _1472322357_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1472322357_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToolTip2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1472322357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToolTip2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2b1ade26299a5d54800b3bea123b4c20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToolTip2(ptr: Pointer?): WithDefault = IToolTip2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToolTip2 {
      val address = segment.toRawLongValue()
      return makeIToolTip2(Pointer(address))
    }

    public override fun toNative(obj: IToolTip2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1472322357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToolTip2): Array<IToolTip2?> = (elements as
        Array<IToolTip2?>).castToImpl<IToolTip2,IToolTip2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToolTip2?> = arrayOfNulls<IToolTip2_Impl>(size)
        as Array<IToolTip2?>
  }
}
