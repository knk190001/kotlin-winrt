package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
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

@ABIMarker(IShareTargetActivatedEventArgs.ABI::class)
@Signature("{4bdaf9c8-cdb2-4acb-bfc3-6648563378ec}")
@Guid("4bdaf9c8cdb24acbbfc36648563378ec")
@WinRTInterface("4bdaf9c8cdb24acbbfc36648563378ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShareTargetActivatedEventArgs.ByReference::class)
public interface IShareTargetActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs
    {
  @InterfaceMethod(0)
  public fun get_ShareOperation(): ShareOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShareTargetActivatedEventArgs> {
    public override fun getValue() = ABI.makeIShareTargetActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IShareTargetActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShareTargetActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __2028286003_Ptr: Pointer?

    public val _2028286003_VtblPtr: Pointer?
      get() = __2028286003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShareOperation(): ShareOperation? {
      val fnPtr = _2028286003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ShareOperation>()
      val hr = fn.invokeHR(arrayOf(__2028286003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ShareOperation>(result.getValue())
      return resultValue
    }
  }

  public class IShareTargetActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2028286003_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2028286003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShareTargetActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4bdaf9c8cdb24acbbfc36648563378ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShareTargetActivatedEventArgs(ptr: Pointer?): WithDefault =
        IShareTargetActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShareTargetActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIShareTargetActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IShareTargetActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2028286003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShareTargetActivatedEventArgs):
        Array<IShareTargetActivatedEventArgs?> = (elements as
        Array<IShareTargetActivatedEventArgs?>).castToImpl<IShareTargetActivatedEventArgs,IShareTargetActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShareTargetActivatedEventArgs?> =
        arrayOfNulls<IShareTargetActivatedEventArgs_Impl>(size) as
        Array<IShareTargetActivatedEventArgs?>
  }
}
