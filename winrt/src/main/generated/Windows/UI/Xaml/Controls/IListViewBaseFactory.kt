package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IListViewBaseFactory.ABI::class)
@Signature("{e67e6c7f-150f-46d0-a6ac-c5002bd9ca53}")
@Guid("e67e6c7f150f46d0a6acc5002bd9ca53")
@WinRTInterface("e67e6c7f150f46d0a6acc5002bd9ca53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseFactory.ByReference::class)
public interface IListViewBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ListViewBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseFactory> {
    public override fun getValue() = ABI.makeIListViewBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseFactory {
    public val __216860934_Ptr: Pointer?

    public val _216860934_VtblPtr: Pointer?
      get() = __216860934_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ListViewBase? {
      val fnPtr = _216860934_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ListViewBase>()
      val hr = fn.invokeHR(arrayOf(__216860934_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ListViewBase>(result.getValue())
      return resultValue
    }
  }

  public class IListViewBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __216860934_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e67e6c7f150f46d0a6acc5002bd9ca53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseFactory(ptr: Pointer?): WithDefault = IListViewBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseFactory {
      val address = segment.toRawLongValue()
      return makeIListViewBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__216860934_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseFactory): Array<IListViewBaseFactory?> =
        (elements as
        Array<IListViewBaseFactory?>).castToImpl<IListViewBaseFactory,IListViewBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseFactory?> =
        arrayOfNulls<IListViewBaseFactory_Impl>(size) as Array<IListViewBaseFactory?>
  }
}
