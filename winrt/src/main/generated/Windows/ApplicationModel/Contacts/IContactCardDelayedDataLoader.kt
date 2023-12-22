package Windows.ApplicationModel.Contacts

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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

@ABIMarker(IContactCardDelayedDataLoader.ABI::class)
@Signature("{b60af902-1546-434d-869c-6e3520760ef3}")
@Guid("b60af9021546434d869c6e3520760ef3")
@WinRTInterface("b60af9021546434d869c6e3520760ef3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactCardDelayedDataLoader.ByReference::class)
public interface IContactCardDelayedDataLoader : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun SetData(contact: Contact?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactCardDelayedDataLoader> {
    public override fun getValue() = ABI.makeIContactCardDelayedDataLoader(pointer.getPointer(0))

    public fun setValue(value: IContactCardDelayedDataLoader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactCardDelayedDataLoader, IClosable.WithDefault {
    public val __921727195_Ptr: Pointer?

    public val _921727195_VtblPtr: Pointer?
      get() = __921727195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetData(contact: Contact?): Unit {
      val fnPtr = _921727195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__921727195_Ptr, marshalToNative(contact),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactCardDelayedDataLoader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_921727195_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __921727195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactCardDelayedDataLoader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b60af9021546434d869c6e3520760ef3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactCardDelayedDataLoader(ptr: Pointer?): WithDefault =
        IContactCardDelayedDataLoader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactCardDelayedDataLoader {
      val address = segment.toRawLongValue()
      return makeIContactCardDelayedDataLoader(Pointer(address))
    }

    public override fun toNative(obj: IContactCardDelayedDataLoader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__921727195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactCardDelayedDataLoader):
        Array<IContactCardDelayedDataLoader?> = (elements as
        Array<IContactCardDelayedDataLoader?>).castToImpl<IContactCardDelayedDataLoader,IContactCardDelayedDataLoader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactCardDelayedDataLoader?> =
        arrayOfNulls<IContactCardDelayedDataLoader_Impl>(size) as
        Array<IContactCardDelayedDataLoader?>
  }
}
