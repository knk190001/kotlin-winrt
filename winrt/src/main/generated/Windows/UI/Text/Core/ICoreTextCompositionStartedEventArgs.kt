package Windows.UI.Text.Core

import Windows.Foundation.Deferral
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

@ABIMarker(ICoreTextCompositionStartedEventArgs.ABI::class)
@Signature("{276b16a9-64e7-4ab0-bc4b-a02d73835bfb}")
@Guid("276b16a964e74ab0bc4ba02d73835bfb")
@WinRTInterface("276b16a964e74ab0bc4ba02d73835bfb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextCompositionStartedEventArgs.ByReference::class)
public interface ICoreTextCompositionStartedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextCompositionStartedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreTextCompositionStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextCompositionStartedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextCompositionStartedEventArgs {
    public val __1376848092_Ptr: Pointer?

    public val _1376848092_VtblPtr: Pointer?
      get() = __1376848092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _1376848092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1376848092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1376848092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1376848092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextCompositionStartedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376848092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextCompositionStartedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("276b16a964e74ab0bc4ba02d73835bfb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextCompositionStartedEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextCompositionStartedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextCompositionStartedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextCompositionStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextCompositionStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376848092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextCompositionStartedEventArgs):
        Array<ICoreTextCompositionStartedEventArgs?> = (elements as
        Array<ICoreTextCompositionStartedEventArgs?>).castToImpl<ICoreTextCompositionStartedEventArgs,ICoreTextCompositionStartedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextCompositionStartedEventArgs?> =
        arrayOfNulls<ICoreTextCompositionStartedEventArgs_Impl>(size) as
        Array<ICoreTextCompositionStartedEventArgs?>
  }
}
