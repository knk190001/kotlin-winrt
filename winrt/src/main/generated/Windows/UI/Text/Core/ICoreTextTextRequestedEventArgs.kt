package Windows.UI.Text.Core

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

@ABIMarker(ICoreTextTextRequestedEventArgs.ABI::class)
@Signature("{f096a2d0-41c6-4c02-8b1a-d953b00cabb3}")
@Guid("f096a2d041c64c028b1ad953b00cabb3")
@WinRTInterface("f096a2d041c64c028b1ad953b00cabb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextTextRequestedEventArgs.ByReference::class)
public interface ICoreTextTextRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): CoreTextTextRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextTextRequestedEventArgs> {
    public override fun getValue() = ABI.makeICoreTextTextRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextTextRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextTextRequestedEventArgs {
    public val __743091546_Ptr: Pointer?

    public val _743091546_VtblPtr: Pointer?
      get() = __743091546_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): CoreTextTextRequest? {
      val fnPtr = _743091546_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextTextRequest>()
      val hr = fn.invokeHR(arrayOf(__743091546_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextTextRequest>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextTextRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __743091546_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextTextRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f096a2d041c64c028b1ad953b00cabb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextTextRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextTextRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextTextRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextTextRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextTextRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__743091546_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextTextRequestedEventArgs):
        Array<ICoreTextTextRequestedEventArgs?> = (elements as
        Array<ICoreTextTextRequestedEventArgs?>).castToImpl<ICoreTextTextRequestedEventArgs,ICoreTextTextRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextTextRequestedEventArgs?> =
        arrayOfNulls<ICoreTextTextRequestedEventArgs_Impl>(size) as
        Array<ICoreTextTextRequestedEventArgs?>
  }
}
