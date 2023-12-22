package Windows.UI.Popups

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

@ABIMarker(IMessageDialogFactory.ABI::class)
@Signature("{2d161777-a66f-4ea5-bb87-793ffa4941f2}")
@Guid("2d161777a66f4ea5bb87793ffa4941f2")
@WinRTInterface("2d161777a66f4ea5bb87793ffa4941f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageDialogFactory.ByReference::class)
public interface IMessageDialogFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(content: String?): MessageDialog?

  @InterfaceMethod(1)
  public fun CreateWithTitle(content: String?, title: String?): MessageDialog?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessageDialogFactory> {
    public override fun getValue() = ABI.makeIMessageDialogFactory(pointer.getPointer(0))

    public fun setValue(value: IMessageDialogFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageDialogFactory {
    public val __163084978_Ptr: Pointer?

    public val _163084978_VtblPtr: Pointer?
      get() = __163084978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(content: String?): MessageDialog? {
      val fnPtr = _163084978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessageDialog>()
      val hr = fn.invokeHR(arrayOf(__163084978_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessageDialog>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithTitle(content: String?, title: String?): MessageDialog? {
      val fnPtr = _163084978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessageDialog>()
      val hr = fn.invokeHR(arrayOf(__163084978_Ptr, marshalToNative(content),
          marshalToNative(title), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessageDialog>(result.getValue())
      return resultValue
    }
  }

  public class IMessageDialogFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __163084978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageDialogFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d161777a66f4ea5bb87793ffa4941f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageDialogFactory(ptr: Pointer?): WithDefault =
        IMessageDialogFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMessageDialogFactory {
      val address = segment.toRawLongValue()
      return makeIMessageDialogFactory(Pointer(address))
    }

    public override fun toNative(obj: IMessageDialogFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__163084978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageDialogFactory): Array<IMessageDialogFactory?> =
        (elements as
        Array<IMessageDialogFactory?>).castToImpl<IMessageDialogFactory,IMessageDialogFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageDialogFactory?> =
        arrayOfNulls<IMessageDialogFactory_Impl>(size) as Array<IMessageDialogFactory?>
  }
}
