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

@ABIMarker(ICachedFileUpdaterTrigger.ABI::class)
@Signature("{e21caeeb-32f2-4d31-b553-b9e01bde37e0}")
@Guid("e21caeeb32f24d31b553b9e01bde37e0")
@WinRTInterface("e21caeeb32f24d31b553b9e01bde37e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICachedFileUpdaterTrigger.ByReference::class)
public interface ICachedFileUpdaterTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICachedFileUpdaterTrigger> {
    public override fun getValue() = ABI.makeICachedFileUpdaterTrigger(pointer.getPointer(0))

    public fun setValue(value: ICachedFileUpdaterTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICachedFileUpdaterTrigger, IBackgroundTrigger.WithDefault {
    public val __1737769730_Ptr: Pointer?

    public val _1737769730_VtblPtr: Pointer?
      get() = __1737769730_Ptr?.getPointer(0)
  }

  public class ICachedFileUpdaterTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1737769730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1737769730_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICachedFileUpdaterTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e21caeeb32f24d31b553b9e01bde37e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICachedFileUpdaterTrigger(ptr: Pointer?): WithDefault =
        ICachedFileUpdaterTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICachedFileUpdaterTrigger {
      val address = segment.toRawLongValue()
      return makeICachedFileUpdaterTrigger(Pointer(address))
    }

    public override fun toNative(obj: ICachedFileUpdaterTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1737769730_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICachedFileUpdaterTrigger):
        Array<ICachedFileUpdaterTrigger?> = (elements as
        Array<ICachedFileUpdaterTrigger?>).castToImpl<ICachedFileUpdaterTrigger,ICachedFileUpdaterTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICachedFileUpdaterTrigger?> =
        arrayOfNulls<ICachedFileUpdaterTrigger_Impl>(size) as Array<ICachedFileUpdaterTrigger?>
  }
}
