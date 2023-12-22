package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IContactActivatedEventArgs.ABI::class)
@Signature("{d627a1c4-c025-4c41-9def-f1eafad075e7}")
@Guid("d627a1c4c0254c419deff1eafad075e7")
@WinRTInterface("d627a1c4c0254c419deff1eafad075e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactActivatedEventArgs.ByReference::class)
public interface IContactActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Verb(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactActivatedEventArgs> {
    public override fun getValue() = ABI.makeIContactActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __90994973_Ptr: Pointer?

    public val _90994973_VtblPtr: Pointer?
      get() = __90994973_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Verb(): String? {
      val fnPtr = _90994973_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__90994973_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContactActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_90994973_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __90994973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d627a1c4c0254c419deff1eafad075e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactActivatedEventArgs(ptr: Pointer?): WithDefault =
        IContactActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__90994973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactActivatedEventArgs):
        Array<IContactActivatedEventArgs?> = (elements as
        Array<IContactActivatedEventArgs?>).castToImpl<IContactActivatedEventArgs,IContactActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactActivatedEventArgs?> =
        arrayOfNulls<IContactActivatedEventArgs_Impl>(size) as Array<IContactActivatedEventArgs?>
  }
}
