package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IProtocolActivatedEventArgs.ABI::class)
@Signature("{6095f4dd-b7c0-46ab-81fe-d90f36d00d24}")
@Guid("6095f4ddb7c046ab81fed90f36d00d24")
@WinRTInterface("6095f4ddb7c046ab81fed90f36d00d24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtocolActivatedEventArgs.ByReference::class)
public interface IProtocolActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtocolActivatedEventArgs> {
    public override fun getValue() = ABI.makeIProtocolActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProtocolActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtocolActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __1709469255_Ptr: Pointer?

    public val _1709469255_VtblPtr: Pointer?
      get() = __1709469255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1709469255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1709469255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IProtocolActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1709469255_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1709469255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtocolActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6095f4ddb7c046ab81fed90f36d00d24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtocolActivatedEventArgs(ptr: Pointer?): WithDefault =
        IProtocolActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtocolActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIProtocolActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProtocolActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1709469255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtocolActivatedEventArgs):
        Array<IProtocolActivatedEventArgs?> = (elements as
        Array<IProtocolActivatedEventArgs?>).castToImpl<IProtocolActivatedEventArgs,IProtocolActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtocolActivatedEventArgs?> =
        arrayOfNulls<IProtocolActivatedEventArgs_Impl>(size) as Array<IProtocolActivatedEventArgs?>
  }
}
