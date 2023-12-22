package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IInkSynchronizer.ABI::class)
@Signature("{9b9ea160-ae9b-45f9-8407-4b493b163661}")
@Guid("9b9ea160ae9b45f984074b493b163661")
@WinRTInterface("9b9ea160ae9b45f984074b493b163661")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkSynchronizer.ByReference::class)
public interface IInkSynchronizer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun BeginDry(): IVectorView<InkStroke?>?

  @InterfaceMethod(1)
  public fun EndDry(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkSynchronizer> {
    public override fun getValue() = ABI.makeIInkSynchronizer(pointer.getPointer(0))

    public fun setValue(value: IInkSynchronizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkSynchronizer {
    public val __260657330_Ptr: Pointer?

    public val _260657330_VtblPtr: Pointer?
      get() = __260657330_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BeginDry(): IVectorView<InkStroke?>? {
      val fnPtr = _260657330_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkStroke?>>()
      val hr = fn.invokeHR(arrayOf(__260657330_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<InkStroke?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun EndDry(): Unit {
      val fnPtr = _260657330_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__260657330_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkSynchronizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __260657330_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkSynchronizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b9ea160ae9b45f984074b493b163661")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkSynchronizer(ptr: Pointer?): WithDefault = IInkSynchronizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkSynchronizer {
      val address = segment.toRawLongValue()
      return makeIInkSynchronizer(Pointer(address))
    }

    public override fun toNative(obj: IInkSynchronizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__260657330_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkSynchronizer): Array<IInkSynchronizer?> = (elements as
        Array<IInkSynchronizer?>).castToImpl<IInkSynchronizer,IInkSynchronizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkSynchronizer?> =
        arrayOfNulls<IInkSynchronizer_Impl>(size) as Array<IInkSynchronizer?>
  }
}
