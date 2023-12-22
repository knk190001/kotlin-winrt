package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Devices.Printers.Extensions.Print3DWorkflow
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

@ABIMarker(IPrint3DWorkflowActivatedEventArgs.ABI::class)
@Signature("{3f57e78b-f2ac-4619-8302-ef855e1c9b90}")
@Guid("3f57e78bf2ac46198302ef855e1c9b90")
@WinRTInterface("3f57e78bf2ac46198302ef855e1c9b90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DWorkflowActivatedEventArgs.ByReference::class)
public interface IPrint3DWorkflowActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Workflow(): Print3DWorkflow?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DWorkflowActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrint3DWorkflowActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrint3DWorkflowActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DWorkflowActivatedEventArgs, IActivatedEventArgs.WithDefault
      {
    public val __1331609722_Ptr: Pointer?

    public val _1331609722_VtblPtr: Pointer?
      get() = __1331609722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Workflow(): Print3DWorkflow? {
      val fnPtr = _1331609722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DWorkflow>()
      val hr = fn.invokeHR(arrayOf(__1331609722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DWorkflow>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DWorkflowActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1331609722_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1331609722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DWorkflowActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f57e78bf2ac46198302ef855e1c9b90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DWorkflowActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPrint3DWorkflowActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DWorkflowActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrint3DWorkflowActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DWorkflowActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1331609722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DWorkflowActivatedEventArgs):
        Array<IPrint3DWorkflowActivatedEventArgs?> = (elements as
        Array<IPrint3DWorkflowActivatedEventArgs?>).castToImpl<IPrint3DWorkflowActivatedEventArgs,IPrint3DWorkflowActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DWorkflowActivatedEventArgs?> =
        arrayOfNulls<IPrint3DWorkflowActivatedEventArgs_Impl>(size) as
        Array<IPrint3DWorkflowActivatedEventArgs?>
  }
}
