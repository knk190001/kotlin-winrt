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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationViewActivatedEventArgs.ABI::class)
@Signature("{930cef4b-b829-40fc-88f4-8513e8a64738}")
@Guid("930cef4bb82940fc88f48513e8a64738")
@WinRTInterface("930cef4bb82940fc88f48513e8a64738")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewActivatedEventArgs.ByReference::class)
public interface IApplicationViewActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_CurrentlyShownApplicationViewId(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIApplicationViewActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewActivatedEventArgs, IActivatedEventArgs.WithDefault
      {
    public val __1142708526_Ptr: Pointer?

    public val _1142708526_VtblPtr: Pointer?
      get() = __1142708526_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentlyShownApplicationViewId(): Int {
      val fnPtr = _1142708526_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1142708526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1142708526_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1142708526_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("930cef4bb82940fc88f48513e8a64738")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewActivatedEventArgs(ptr: Pointer?): WithDefault =
        IApplicationViewActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIApplicationViewActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1142708526_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewActivatedEventArgs):
        Array<IApplicationViewActivatedEventArgs?> = (elements as
        Array<IApplicationViewActivatedEventArgs?>).castToImpl<IApplicationViewActivatedEventArgs,IApplicationViewActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewActivatedEventArgs?> =
        arrayOfNulls<IApplicationViewActivatedEventArgs_Impl>(size) as
        Array<IApplicationViewActivatedEventArgs?>
  }
}
