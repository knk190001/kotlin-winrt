package Windows.Gaming.UI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IGameUIProviderActivatedEventArgs.ABI::class)
@Signature("{a7b3203e-caf7-4ded-bbd2-47de43bb6dd5}")
@Guid("a7b3203ecaf74dedbbd247de43bb6dd5")
@WinRTInterface("a7b3203ecaf74dedbbd247de43bb6dd5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameUIProviderActivatedEventArgs.ByReference::class)
public interface IGameUIProviderActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_GameUIArgs(): ValueSet?

  @InterfaceMethod(1)
  public fun ReportCompleted(results: ValueSet?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameUIProviderActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIGameUIProviderActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGameUIProviderActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameUIProviderActivatedEventArgs, IActivatedEventArgs.WithDefault
      {
    public val __17613022_Ptr: Pointer?

    public val _17613022_VtblPtr: Pointer?
      get() = __17613022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GameUIArgs(): ValueSet? {
      val fnPtr = _17613022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__17613022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportCompleted(results: ValueSet?): Unit {
      val fnPtr = _17613022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__17613022_Ptr, marshalToNative(results),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameUIProviderActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_17613022_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __17613022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameUIProviderActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7b3203ecaf74dedbbd247de43bb6dd5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameUIProviderActivatedEventArgs(ptr: Pointer?): WithDefault =
        IGameUIProviderActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameUIProviderActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGameUIProviderActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGameUIProviderActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__17613022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameUIProviderActivatedEventArgs):
        Array<IGameUIProviderActivatedEventArgs?> = (elements as
        Array<IGameUIProviderActivatedEventArgs?>).castToImpl<IGameUIProviderActivatedEventArgs,IGameUIProviderActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameUIProviderActivatedEventArgs?> =
        arrayOfNulls<IGameUIProviderActivatedEventArgs_Impl>(size) as
        Array<IGameUIProviderActivatedEventArgs?>
  }
}
