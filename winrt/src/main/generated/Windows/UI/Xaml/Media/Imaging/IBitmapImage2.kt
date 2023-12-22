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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapImage2.ABI::class)
@Signature("{1069c1b6-8c9b-4762-be3d-759f5698f2b3}")
@Guid("1069c1b68c9b4762be3d759f5698f2b3")
@WinRTInterface("1069c1b68c9b4762be3d759f5698f2b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImage2.ByReference::class)
public interface IBitmapImage2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DecodePixelType(): DecodePixelType?

  @InterfaceMethod(1)
  public fun put_DecodePixelType(value: DecodePixelType?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapImage2>
      {
    public override fun getValue() = ABI.makeIBitmapImage2(pointer.getPointer(0))

    public fun setValue(value: IBitmapImage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImage2 {
    public val __148003384_Ptr: Pointer?

    public val _148003384_VtblPtr: Pointer?
      get() = __148003384_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DecodePixelType(): DecodePixelType? {
      val fnPtr = _148003384_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DecodePixelType>()
      val hr = fn.invokeHR(arrayOf(__148003384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DecodePixelType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DecodePixelType(value: DecodePixelType?): Unit {
      val fnPtr = _148003384_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__148003384_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapImage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __148003384_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1069c1b68c9b4762be3d759f5698f2b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImage2(ptr: Pointer?): WithDefault = IBitmapImage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImage2 {
      val address = segment.toRawLongValue()
      return makeIBitmapImage2(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__148003384_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImage2): Array<IBitmapImage2?> = (elements as
        Array<IBitmapImage2?>).castToImpl<IBitmapImage2,IBitmapImage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImage2?> =
        arrayOfNulls<IBitmapImage2_Impl>(size) as Array<IBitmapImage2?>
  }
}
