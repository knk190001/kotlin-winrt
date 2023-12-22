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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextElement3.ABI::class)
@Signature("{d1db340f-1bc4-4ca8-bcf7-770bff9b27ab}")
@Guid("d1db340f1bc44ca8bcf7770bff9b27ab")
@WinRTInterface("d1db340f1bc44ca8bcf7770bff9b27ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElement3.ByReference::class)
public interface ITextElement3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowFocusOnInteraction(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowFocusOnInteraction(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AccessKey(): String?

  @InterfaceMethod(3)
  public fun put_AccessKey(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean

  @InterfaceMethod(5)
  public fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextElement3>
      {
    public override fun getValue() = ABI.makeITextElement3(pointer.getPointer(0))

    public fun setValue(value: ITextElement3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElement3 {
    public val __791160620_Ptr: Pointer?

    public val _791160620_VtblPtr: Pointer?
      get() = __791160620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowFocusOnInteraction(): Boolean {
      val fnPtr = _791160620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__791160620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowFocusOnInteraction(value: Boolean): Unit {
      val fnPtr = _791160620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160620_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AccessKey(): String? {
      val fnPtr = _791160620_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__791160620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AccessKey(value: String?): Unit {
      val fnPtr = _791160620_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160620_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ExitDisplayModeOnAccessKeyInvoked(): Boolean {
      val fnPtr = _791160620_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__791160620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_ExitDisplayModeOnAccessKeyInvoked(value: Boolean): Unit {
      val fnPtr = _791160620_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__791160620_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextElement3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __791160620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElement3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1db340f1bc44ca8bcf7770bff9b27ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElement3(ptr: Pointer?): WithDefault = ITextElement3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElement3 {
      val address = segment.toRawLongValue()
      return makeITextElement3(Pointer(address))
    }

    public override fun toNative(obj: ITextElement3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__791160620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElement3): Array<ITextElement3?> = (elements as
        Array<ITextElement3?>).castToImpl<ITextElement3,ITextElement3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElement3?> =
        arrayOfNulls<ITextElement3_Impl>(size) as Array<ITextElement3?>
  }
}
