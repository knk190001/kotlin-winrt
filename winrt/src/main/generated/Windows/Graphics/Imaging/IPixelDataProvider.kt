package Windows.Graphics.Imaging

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPixelDataProvider.ABI::class)
@Signature("{dd831f25-185c-4595-9fb9-ccbe6ec18a6f}")
@Guid("dd831f25185c45959fb9ccbe6ec18a6f")
@WinRTInterface("dd831f25185c45959fb9ccbe6ec18a6f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPixelDataProvider.ByReference::class)
public interface IPixelDataProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DetachPixelData(): Array<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPixelDataProvider> {
    public override fun getValue() = ABI.makeIPixelDataProvider(pointer.getPointer(0))

    public fun setValue(value: IPixelDataProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPixelDataProvider {
    public val __976755912_Ptr: Pointer?

    public val _976755912_VtblPtr: Pointer?
      get() = __976755912_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DetachPixelData(): Array<Byte>? {
      val fnPtr = _976755912_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__976755912_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IPixelDataProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __976755912_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPixelDataProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd831f25185c45959fb9ccbe6ec18a6f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPixelDataProvider(ptr: Pointer?): WithDefault = IPixelDataProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPixelDataProvider {
      val address = segment.toRawLongValue()
      return makeIPixelDataProvider(Pointer(address))
    }

    public override fun toNative(obj: IPixelDataProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__976755912_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPixelDataProvider): Array<IPixelDataProvider?> =
        (elements as
        Array<IPixelDataProvider?>).castToImpl<IPixelDataProvider,IPixelDataProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPixelDataProvider?> =
        arrayOfNulls<IPixelDataProvider_Impl>(size) as Array<IPixelDataProvider?>
  }
}
