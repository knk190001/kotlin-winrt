package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ICommandBarElement.ABI::class)
@Signature("{f8eb20b4-373e-5327-9942-66a1ea21f5f9}")
@Guid("f8eb20b4373e5327994266a1ea21f5f9")
@WinRTInterface("f8eb20b4373e5327994266a1ea21f5f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarElement.ByReference::class)
public interface ICommandBarElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCompact(): Boolean

  @InterfaceMethod(1)
  public fun put_IsCompact(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsInOverflow(): Boolean

  @InterfaceMethod(3)
  public fun get_DynamicOverflowOrder(): Int

  @InterfaceMethod(4)
  public fun put_DynamicOverflowOrder(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarElement> {
    public override fun getValue() = ABI.makeICommandBarElement(pointer.getPointer(0))

    public fun setValue(value: ICommandBarElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarElement {
    public val __814939603_Ptr: Pointer?

    public val _814939603_VtblPtr: Pointer?
      get() = __814939603_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCompact(): Boolean {
      val fnPtr = _814939603_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__814939603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsCompact(value: Boolean): Unit {
      val fnPtr = _814939603_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__814939603_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsInOverflow(): Boolean {
      val fnPtr = _814939603_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__814939603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DynamicOverflowOrder(): Int {
      val fnPtr = _814939603_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__814939603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_DynamicOverflowOrder(value: Int): Unit {
      val fnPtr = _814939603_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__814939603_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBarElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __814939603_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8eb20b4373e5327994266a1ea21f5f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarElement(ptr: Pointer?): WithDefault = ICommandBarElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarElement {
      val address = segment.toRawLongValue()
      return makeICommandBarElement(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__814939603_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarElement): Array<ICommandBarElement?> =
        (elements as
        Array<ICommandBarElement?>).castToImpl<ICommandBarElement,ICommandBarElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarElement?> =
        arrayOfNulls<ICommandBarElement_Impl>(size) as Array<ICommandBarElement?>
  }
}
