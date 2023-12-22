package Windows.UI.Xaml.Documents

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

@ABIMarker(IHyperlink5.ABI::class)
@Signature("{607dd7d2-0945-4328-91ee-94ccec2ea6c3}")
@Guid("607dd7d20945432891ee94ccec2ea6c3")
@WinRTInterface("607dd7d20945432891ee94ccec2ea6c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlink5.ByReference::class)
public interface IHyperlink5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTabStop(): Boolean

  @InterfaceMethod(1)
  public fun put_IsTabStop(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_TabIndex(): Int

  @InterfaceMethod(3)
  public fun put_TabIndex(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHyperlink5> {
    public override fun getValue() = ABI.makeIHyperlink5(pointer.getPointer(0))

    public fun setValue(value: IHyperlink5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlink5 {
    public val __932194121_Ptr: Pointer?

    public val _932194121_VtblPtr: Pointer?
      get() = __932194121_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTabStop(): Boolean {
      val fnPtr = _932194121_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__932194121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsTabStop(value: Boolean): Unit {
      val fnPtr = _932194121_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194121_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TabIndex(): Int {
      val fnPtr = _932194121_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__932194121_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TabIndex(value: Int): Unit {
      val fnPtr = _932194121_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194121_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHyperlink5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932194121_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlink5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("607dd7d20945432891ee94ccec2ea6c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlink5(ptr: Pointer?): WithDefault = IHyperlink5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlink5 {
      val address = segment.toRawLongValue()
      return makeIHyperlink5(Pointer(address))
    }

    public override fun toNative(obj: IHyperlink5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932194121_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlink5): Array<IHyperlink5?> = (elements as
        Array<IHyperlink5?>).castToImpl<IHyperlink5,IHyperlink5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlink5?> =
        arrayOfNulls<IHyperlink5_Impl>(size) as Array<IHyperlink5?>
  }
}
