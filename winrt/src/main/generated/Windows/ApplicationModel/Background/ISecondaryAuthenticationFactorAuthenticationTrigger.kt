package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryAuthenticationFactorAuthenticationTrigger.ABI::class)
@Signature("{f237f327-5181-4f24-96a7-700a4e5fac62}")
@Guid("f237f32751814f2496a7700a4e5fac62")
@WinRTInterface("f237f32751814f2496a7700a4e5fac62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorAuthenticationTrigger.ByReference::class)
public interface ISecondaryAuthenticationFactorAuthenticationTrigger : NativeMapped,
    IWinRTInterface, IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorAuthenticationTrigger> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorAuthenticationTrigger(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorAuthenticationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorAuthenticationTrigger,
      IBackgroundTrigger.WithDefault {
    public val __1616872726_Ptr: Pointer?

    public val _1616872726_VtblPtr: Pointer?
      get() = __1616872726_Ptr?.getPointer(0)
  }

  public class ISecondaryAuthenticationFactorAuthenticationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1616872726_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1616872726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorAuthenticationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f237f32751814f2496a7700a4e5fac62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorAuthenticationTrigger(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorAuthenticationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorAuthenticationTrigger {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorAuthenticationTrigger(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorAuthenticationTrigger):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1616872726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorAuthenticationTrigger):
        Array<ISecondaryAuthenticationFactorAuthenticationTrigger?> = (elements as
        Array<ISecondaryAuthenticationFactorAuthenticationTrigger?>).castToImpl<ISecondaryAuthenticationFactorAuthenticationTrigger,ISecondaryAuthenticationFactorAuthenticationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorAuthenticationTrigger?> =
        arrayOfNulls<ISecondaryAuthenticationFactorAuthenticationTrigger_Impl>(size) as
        Array<ISecondaryAuthenticationFactorAuthenticationTrigger?>
  }
}
