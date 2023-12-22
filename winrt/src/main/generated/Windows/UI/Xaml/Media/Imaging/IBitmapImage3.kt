package Windows.UI.Xaml.Media.Imaging

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

@ABIMarker(IBitmapImage3.ABI::class)
@Signature("{f1de6f26-3c73-453f-a7ba-9b85c18b3733}")
@Guid("f1de6f263c73453fa7ba9b85c18b3733")
@WinRTInterface("f1de6f263c73453fa7ba9b85c18b3733")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImage3.ByReference::class)
public interface IBitmapImage3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsAnimatedBitmap(): Boolean

  @InterfaceMethod(1)
  public fun get_IsPlaying(): Boolean

  @InterfaceMethod(2)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(3)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun Play(): Unit

  @InterfaceMethod(5)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapImage3>
      {
    public override fun getValue() = ABI.makeIBitmapImage3(pointer.getPointer(0))

    public fun setValue(value: IBitmapImage3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImage3 {
    public val __148003385_Ptr: Pointer?

    public val _148003385_VtblPtr: Pointer?
      get() = __148003385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsAnimatedBitmap(): Boolean {
      val fnPtr = _148003385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__148003385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsPlaying(): Boolean {
      val fnPtr = _148003385_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__148003385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _148003385_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__148003385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _148003385_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__148003385_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Play(): Unit {
      val fnPtr = _148003385_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__148003385_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Stop(): Unit {
      val fnPtr = _148003385_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__148003385_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapImage3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __148003385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImage3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1de6f263c73453fa7ba9b85c18b3733")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImage3(ptr: Pointer?): WithDefault = IBitmapImage3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImage3 {
      val address = segment.toRawLongValue()
      return makeIBitmapImage3(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImage3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__148003385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImage3): Array<IBitmapImage3?> = (elements as
        Array<IBitmapImage3?>).castToImpl<IBitmapImage3,IBitmapImage3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImage3?> =
        arrayOfNulls<IBitmapImage3_Impl>(size) as Array<IBitmapImage3?>
  }
}
