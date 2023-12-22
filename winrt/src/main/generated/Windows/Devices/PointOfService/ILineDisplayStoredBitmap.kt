package Windows.Devices.PointOfService

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ILineDisplayStoredBitmap.ABI::class)
@Signature("{f621515b-d81e-43ba-bf1b-bcfa3c785ba0}")
@Guid("f621515bd81e43babf1bbcfa3c785ba0")
@WinRTInterface("f621515bd81e43babf1bbcfa3c785ba0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayStoredBitmap.ByReference::class)
public interface ILineDisplayStoredBitmap : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EscapeSequence(): String?

  @InterfaceMethod(1)
  public fun TryDeleteAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayStoredBitmap> {
    public override fun getValue() = ABI.makeILineDisplayStoredBitmap(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayStoredBitmap_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayStoredBitmap {
    public val __146628095_Ptr: Pointer?

    public val _146628095_VtblPtr: Pointer?
      get() = __146628095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EscapeSequence(): String? {
      val fnPtr = _146628095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__146628095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryDeleteAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _146628095_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__146628095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayStoredBitmap_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __146628095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayStoredBitmap, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f621515bd81e43babf1bbcfa3c785ba0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayStoredBitmap(ptr: Pointer?): WithDefault =
        ILineDisplayStoredBitmap_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayStoredBitmap {
      val address = segment.toRawLongValue()
      return makeILineDisplayStoredBitmap(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayStoredBitmap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__146628095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayStoredBitmap):
        Array<ILineDisplayStoredBitmap?> = (elements as
        Array<ILineDisplayStoredBitmap?>).castToImpl<ILineDisplayStoredBitmap,ILineDisplayStoredBitmap_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayStoredBitmap?> =
        arrayOfNulls<ILineDisplayStoredBitmap_Impl>(size) as Array<ILineDisplayStoredBitmap?>
  }
}
