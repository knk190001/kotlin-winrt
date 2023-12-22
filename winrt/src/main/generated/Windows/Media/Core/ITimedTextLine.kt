package Windows.Media.Core

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedTextLine.ABI::class)
@Signature("{978d7ce2-7308-4c66-be50-65777289f5df}")
@Guid("978d7ce273084c66be5065777289f5df")
@WinRTInterface("978d7ce273084c66be5065777289f5df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedTextLine.ByReference::class)
public interface ITimedTextLine : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Subformats(): IVector<TimedTextSubformat?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITimedTextLine>
      {
    public override fun getValue() = ABI.makeITimedTextLine(pointer.getPointer(0))

    public fun setValue(value: ITimedTextLine_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedTextLine {
    public val __241629795_Ptr: Pointer?

    public val _241629795_VtblPtr: Pointer?
      get() = __241629795_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _241629795_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__241629795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _241629795_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__241629795_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Subformats(): IVector<TimedTextSubformat?>? {
      val fnPtr = _241629795_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<TimedTextSubformat?>>()
      val hr = fn.invokeHR(arrayOf(__241629795_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<TimedTextSubformat?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimedTextLine_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __241629795_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedTextLine, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("978d7ce273084c66be5065777289f5df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedTextLine(ptr: Pointer?): WithDefault = ITimedTextLine_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedTextLine {
      val address = segment.toRawLongValue()
      return makeITimedTextLine(Pointer(address))
    }

    public override fun toNative(obj: ITimedTextLine): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__241629795_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedTextLine): Array<ITimedTextLine?> = (elements as
        Array<ITimedTextLine?>).castToImpl<ITimedTextLine,ITimedTextLine_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedTextLine?> =
        arrayOfNulls<ITimedTextLine_Impl>(size) as Array<ITimedTextLine?>
  }
}
