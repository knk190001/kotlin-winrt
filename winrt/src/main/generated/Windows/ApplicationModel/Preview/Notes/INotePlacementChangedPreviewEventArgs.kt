package Windows.ApplicationModel.Preview.Notes

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

@ABIMarker(INotePlacementChangedPreviewEventArgs.ABI::class)
@Signature("{491d57b7-f780-4e7f-a939-9a4caf965214}")
@Guid("491d57b7f7804e7fa9399a4caf965214")
@WinRTInterface("491d57b7f7804e7fa9399a4caf965214")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotePlacementChangedPreviewEventArgs.ByReference::class)
public interface INotePlacementChangedPreviewEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotePlacementChangedPreviewEventArgs> {
    public override fun getValue() =
        ABI.makeINotePlacementChangedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: INotePlacementChangedPreviewEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotePlacementChangedPreviewEventArgs {
    public val __2129164296_Ptr: Pointer?

    public val _2129164296_VtblPtr: Pointer?
      get() = __2129164296_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewId(): Int {
      val fnPtr = _2129164296_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2129164296_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class INotePlacementChangedPreviewEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129164296_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotePlacementChangedPreviewEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("491d57b7f7804e7fa9399a4caf965214")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotePlacementChangedPreviewEventArgs(ptr: Pointer?): WithDefault =
        INotePlacementChangedPreviewEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotePlacementChangedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return makeINotePlacementChangedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INotePlacementChangedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129164296_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotePlacementChangedPreviewEventArgs):
        Array<INotePlacementChangedPreviewEventArgs?> = (elements as
        Array<INotePlacementChangedPreviewEventArgs?>).castToImpl<INotePlacementChangedPreviewEventArgs,INotePlacementChangedPreviewEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotePlacementChangedPreviewEventArgs?> =
        arrayOfNulls<INotePlacementChangedPreviewEventArgs_Impl>(size) as
        Array<INotePlacementChangedPreviewEventArgs?>
  }
}
