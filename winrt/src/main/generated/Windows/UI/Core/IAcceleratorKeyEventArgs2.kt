package Windows.UI.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAcceleratorKeyEventArgs2.ABI::class)
@Signature("{d300a9f6-2f7e-4873-a555-166e596ee1c5}")
@Guid("d300a9f62f7e4873a555166e596ee1c5")
@WinRTInterface("d300a9f62f7e4873a555166e596ee1c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAcceleratorKeyEventArgs2.ByReference::class)
public interface IAcceleratorKeyEventArgs2 : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAcceleratorKeyEventArgs2> {
    public override fun getValue() = ABI.makeIAcceleratorKeyEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAcceleratorKeyEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAcceleratorKeyEventArgs2, ICoreWindowEventArgs.WithDefault {
    public val __1438203286_Ptr: Pointer?

    public val _1438203286_VtblPtr: Pointer?
      get() = __1438203286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1438203286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1438203286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAcceleratorKeyEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1438203286_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1438203286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAcceleratorKeyEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d300a9f62f7e4873a555166e596ee1c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAcceleratorKeyEventArgs2(ptr: Pointer?): WithDefault =
        IAcceleratorKeyEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAcceleratorKeyEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAcceleratorKeyEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAcceleratorKeyEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1438203286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAcceleratorKeyEventArgs2):
        Array<IAcceleratorKeyEventArgs2?> = (elements as
        Array<IAcceleratorKeyEventArgs2?>).castToImpl<IAcceleratorKeyEventArgs2,IAcceleratorKeyEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAcceleratorKeyEventArgs2?> =
        arrayOfNulls<IAcceleratorKeyEventArgs2_Impl>(size) as Array<IAcceleratorKeyEventArgs2?>
  }
}
