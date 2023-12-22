package Windows.System.Display

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

@ABIMarker(IDisplayRequest.ABI::class)
@Signature("{e5732044-f49f-4b60-8dd4-5e7e3a632ac0}")
@Guid("e5732044f49f4b608dd45e7e3a632ac0")
@WinRTInterface("e5732044f49f4b608dd45e7e3a632ac0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayRequest.ByReference::class)
public interface IDisplayRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestActive(): Unit

  @InterfaceMethod(1)
  public fun RequestRelease(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayRequest> {
    public override fun getValue() = ABI.makeIDisplayRequest(pointer.getPointer(0))

    public fun setValue(value: IDisplayRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayRequest {
    public val __1989855080_Ptr: Pointer?

    public val _1989855080_VtblPtr: Pointer?
      get() = __1989855080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestActive(): Unit {
      val fnPtr = _1989855080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1989855080_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun RequestRelease(): Unit {
      val fnPtr = _1989855080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1989855080_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1989855080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5732044f49f4b608dd45e7e3a632ac0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayRequest(ptr: Pointer?): WithDefault = IDisplayRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayRequest {
      val address = segment.toRawLongValue()
      return makeIDisplayRequest(Pointer(address))
    }

    public override fun toNative(obj: IDisplayRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1989855080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayRequest): Array<IDisplayRequest?> = (elements as
        Array<IDisplayRequest?>).castToImpl<IDisplayRequest,IDisplayRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayRequest?> =
        arrayOfNulls<IDisplayRequest_Impl>(size) as Array<IDisplayRequest?>
  }
}
