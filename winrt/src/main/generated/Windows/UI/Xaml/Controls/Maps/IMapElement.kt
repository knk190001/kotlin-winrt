package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapElement.ABI::class)
@Signature("{d61fc4df-b245-47f2-9ac2-43c058b1c903}")
@Guid("d61fc4dfb24547f29ac243c058b1c903")
@WinRTInterface("d61fc4dfb24547f29ac243c058b1c903")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElement.ByReference::class)
public interface IMapElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ZIndex(): Int

  @InterfaceMethod(1)
  public fun put_ZIndex(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Visible(): Boolean

  @InterfaceMethod(3)
  public fun put_Visible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapElement> {
    public override fun getValue() = ABI.makeIMapElement(pointer.getPointer(0))

    public fun setValue(value: IMapElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElement {
    public val __629222929_Ptr: Pointer?

    public val _629222929_VtblPtr: Pointer?
      get() = __629222929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ZIndex(): Int {
      val fnPtr = _629222929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__629222929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_ZIndex(value: Int): Unit {
      val fnPtr = _629222929_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629222929_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Visible(): Boolean {
      val fnPtr = _629222929_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__629222929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Visible(value: Boolean): Unit {
      val fnPtr = _629222929_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__629222929_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __629222929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d61fc4dfb24547f29ac243c058b1c903")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElement(ptr: Pointer?): WithDefault = IMapElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElement {
      val address = segment.toRawLongValue()
      return makeIMapElement(Pointer(address))
    }

    public override fun toNative(obj: IMapElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__629222929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElement): Array<IMapElement?> = (elements as
        Array<IMapElement?>).castToImpl<IMapElement,IMapElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElement?> =
        arrayOfNulls<IMapElement_Impl>(size) as Array<IMapElement?>
  }
}
