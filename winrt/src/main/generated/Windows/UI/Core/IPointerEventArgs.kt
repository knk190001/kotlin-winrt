package Windows.UI.Core

import Windows.Foundation.Collections.IVector
import Windows.System.VirtualKeyModifiers
import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
import Windows.UI.Input.PointerPoint
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

@ABIMarker(IPointerEventArgs.ABI::class)
@Signature("{920d9cb1-a5fc-4a21-8c09-49dfe6ffe25f}")
@Guid("920d9cb1a5fc4a218c0949dfe6ffe25f")
@WinRTInterface("920d9cb1a5fc4a218c0949dfe6ffe25f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerEventArgs.ByReference::class)
public interface IPointerEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_CurrentPoint(): PointerPoint?

  @InterfaceMethod(1)
  public fun get_KeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(2)
  public fun GetIntermediatePoints(): IVector<PointerPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerEventArgs> {
    public override fun getValue() = ABI.makeIPointerEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPointerEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __564354379_Ptr: Pointer?

    public val _564354379_VtblPtr: Pointer?
      get() = __564354379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentPoint(): PointerPoint? {
      val fnPtr = _564354379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__564354379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _564354379_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__564354379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetIntermediatePoints(): IVector<PointerPoint?>? {
      val fnPtr = _564354379_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__564354379_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_564354379_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __564354379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("920d9cb1a5fc4a218c0949dfe6ffe25f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerEventArgs(ptr: Pointer?): WithDefault = IPointerEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerEventArgs {
      val address = segment.toRawLongValue()
      return makeIPointerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPointerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__564354379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerEventArgs): Array<IPointerEventArgs?> = (elements
        as Array<IPointerEventArgs?>).castToImpl<IPointerEventArgs,IPointerEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerEventArgs?> =
        arrayOfNulls<IPointerEventArgs_Impl>(size) as Array<IPointerEventArgs?>
  }
}
