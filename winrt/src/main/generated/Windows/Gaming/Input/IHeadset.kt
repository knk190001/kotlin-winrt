package Windows.Gaming.Input

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

@ABIMarker(IHeadset.ABI::class)
@Signature("{3fd156ef-6925-3fa8-9181-029c5223ae3b}")
@Guid("3fd156ef69253fa89181029c5223ae3b")
@WinRTInterface("3fd156ef69253fa89181029c5223ae3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHeadset.ByReference::class)
public interface IHeadset : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CaptureDeviceId(): String?

  @InterfaceMethod(1)
  public fun get_RenderDeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHeadset> {
    public override fun getValue() = ABI.makeIHeadset(pointer.getPointer(0))

    public fun setValue(value: IHeadset_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHeadset {
    public val __1409717999_Ptr: Pointer?

    public val _1409717999_VtblPtr: Pointer?
      get() = __1409717999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CaptureDeviceId(): String? {
      val fnPtr = _1409717999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1409717999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RenderDeviceId(): String? {
      val fnPtr = _1409717999_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1409717999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHeadset_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1409717999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHeadset, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fd156ef69253fa89181029c5223ae3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHeadset(ptr: Pointer?): WithDefault = IHeadset_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHeadset {
      val address = segment.toRawLongValue()
      return makeIHeadset(Pointer(address))
    }

    public override fun toNative(obj: IHeadset): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1409717999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHeadset): Array<IHeadset?> = (elements as
        Array<IHeadset?>).castToImpl<IHeadset,IHeadset_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHeadset?> = arrayOfNulls<IHeadset_Impl>(size) as
        Array<IHeadset?>
  }
}
