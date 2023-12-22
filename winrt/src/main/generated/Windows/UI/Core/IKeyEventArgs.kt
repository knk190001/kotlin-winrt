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

@ABIMarker(IKeyEventArgs.ABI::class)
@Signature("{5ff5e930-2544-4a17-bd78-1f2fdebb106b}")
@Guid("5ff5e93025444a17bd781f2fdebb106b")
@WinRTInterface("5ff5e93025444a17bd781f2fdebb106b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyEventArgs.ByReference::class)
public interface IKeyEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_VirtualKey(): VirtualKey?

  @InterfaceMethod(1)
  public fun get_KeyStatus(): CorePhysicalKeyStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IKeyEventArgs>
      {
    public override fun getValue() = ABI.makeIKeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: IKeyEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __417885779_Ptr: Pointer?

    public val _417885779_VtblPtr: Pointer?
      get() = __417885779_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VirtualKey(): VirtualKey? {
      val fnPtr = _417885779_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__417885779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyStatus(): CorePhysicalKeyStatus? {
      val fnPtr = _417885779_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CorePhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__417885779_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CorePhysicalKeyStatus>(result.getValue())
      return resultValue
    }
  }

  public class IKeyEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_417885779_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __417885779_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ff5e93025444a17bd781f2fdebb106b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyEventArgs(ptr: Pointer?): WithDefault = IKeyEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyEventArgs {
      val address = segment.toRawLongValue()
      return makeIKeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IKeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__417885779_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyEventArgs): Array<IKeyEventArgs?> = (elements as
        Array<IKeyEventArgs?>).castToImpl<IKeyEventArgs,IKeyEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyEventArgs?> =
        arrayOfNulls<IKeyEventArgs_Impl>(size) as Array<IKeyEventArgs?>
  }
}
