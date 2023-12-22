package Windows.UI.Core

import Windows.System.VirtualKey
import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
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

@ABIMarker(IAcceleratorKeyEventArgs.ABI::class)
@Signature("{ff1c4c4a-9287-470b-836e-9086e3126ade}")
@Guid("ff1c4c4a9287470b836e9086e3126ade")
@WinRTInterface("ff1c4c4a9287470b836e9086e3126ade")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcceleratorKeyEventArgs.ByReference::class)
public interface IAcceleratorKeyEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_EventType(): CoreAcceleratorKeyEventType?

  @InterfaceMethod(1)
  public fun get_VirtualKey(): VirtualKey?

  @InterfaceMethod(2)
  public fun get_KeyStatus(): CorePhysicalKeyStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAcceleratorKeyEventArgs> {
    public override fun getValue() = ABI.makeIAcceleratorKeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAcceleratorKeyEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcceleratorKeyEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __46393656_Ptr: Pointer?

    public val _46393656_VtblPtr: Pointer?
      get() = __46393656_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EventType(): CoreAcceleratorKeyEventType? {
      val fnPtr = _46393656_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreAcceleratorKeyEventType>()
      val hr = fn.invokeHR(arrayOf(__46393656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreAcceleratorKeyEventType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VirtualKey(): VirtualKey? {
      val fnPtr = _46393656_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__46393656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyStatus(): CorePhysicalKeyStatus? {
      val fnPtr = _46393656_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CorePhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__46393656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CorePhysicalKeyStatus>(result.getValue())
      return resultValue
    }
  }

  public class IAcceleratorKeyEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_46393656_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __46393656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcceleratorKeyEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff1c4c4a9287470b836e9086e3126ade")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcceleratorKeyEventArgs(ptr: Pointer?): WithDefault =
        IAcceleratorKeyEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcceleratorKeyEventArgs {
      val address = segment.toRawLongValue()
      return makeIAcceleratorKeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAcceleratorKeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__46393656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcceleratorKeyEventArgs):
        Array<IAcceleratorKeyEventArgs?> = (elements as
        Array<IAcceleratorKeyEventArgs?>).castToImpl<IAcceleratorKeyEventArgs,IAcceleratorKeyEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcceleratorKeyEventArgs?> =
        arrayOfNulls<IAcceleratorKeyEventArgs_Impl>(size) as Array<IAcceleratorKeyEventArgs?>
  }
}
