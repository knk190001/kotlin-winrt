package Microsoft.UI.Xaml.Controls

import Windows.ApplicationModel.DataTransfer.DataPackage
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITabViewTabDragStartingEventArgs.ABI::class)
@Signature("{97682812-1a7b-53fd-8b4e-c2f70d2ad250}")
@Guid("976828121a7b53fd8b4ec2f70d2ad250")
@WinRTInterface("976828121a7b53fd8b4ec2f70d2ad250")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewTabDragStartingEventArgs.ByReference::class)
public interface ITabViewTabDragStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Data(): DataPackage?

  @InterfaceMethod(3)
  public fun get_Item(): IUnknown?

  @InterfaceMethod(4)
  public fun get_Tab(): TabViewItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewTabDragStartingEventArgs> {
    public override fun getValue() = ABI.makeITabViewTabDragStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITabViewTabDragStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewTabDragStartingEventArgs {
    public val __662904353_Ptr: Pointer?

    public val _662904353_VtblPtr: Pointer?
      get() = __662904353_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _662904353_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__662904353_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _662904353_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__662904353_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Data(): DataPackage? {
      val fnPtr = _662904353_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataPackage>()
      val hr = fn.invokeHR(arrayOf(__662904353_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataPackage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Item(): IUnknown? {
      val fnPtr = _662904353_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__662904353_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Tab(): TabViewItem? {
      val fnPtr = _662904353_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TabViewItem>()
      val hr = fn.invokeHR(arrayOf(__662904353_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TabViewItem>(result.getValue())
      return resultValue
    }
  }

  public class ITabViewTabDragStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __662904353_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewTabDragStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("976828121a7b53fd8b4ec2f70d2ad250")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewTabDragStartingEventArgs(ptr: Pointer?): WithDefault =
        ITabViewTabDragStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewTabDragStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeITabViewTabDragStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITabViewTabDragStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__662904353_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewTabDragStartingEventArgs):
        Array<ITabViewTabDragStartingEventArgs?> = (elements as
        Array<ITabViewTabDragStartingEventArgs?>).castToImpl<ITabViewTabDragStartingEventArgs,ITabViewTabDragStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewTabDragStartingEventArgs?> =
        arrayOfNulls<ITabViewTabDragStartingEventArgs_Impl>(size) as
        Array<ITabViewTabDragStartingEventArgs?>
  }
}
