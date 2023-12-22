package Windows.Services.TargetedContent

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TargetedContentChangedEventArgs.ABI::class)
@Signature("rc(Windows.Services.TargetedContent.TargetedContentChangedEventArgs;{99d488c9-587e-4586-8ef7-b54ca9453a16})")
@WinRTByReference(brClass = TargetedContentChangedEventArgs.ByReference::class)
public class TargetedContentChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetedContentChangedEventArgs.WithDefault, IWinRTObject {
  private val __908663993_Interface: ITargetedContentChangedEventArgs.WithDefault by lazy {
    as_908663993()
  }


  public override val __908663993_Ptr: JNAPointer? by lazy {
    __908663993_Interface.__908663993_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__908663993_Interface)

  private fun as_908663993(): ITargetedContentChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITargetedContentChangedEventArgs.ABI.makeITargetedContentChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetedContentChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetedContentChangedEventArgs.ABI.makeITargetedContentChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetedContentChangedEventArgs> {
    public override fun getValue() = TargetedContentChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TargetedContentChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetedContentChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetedContentChangedEventArgs {
      val address = segment.toRawLongValue()
      return TargetedContentChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TargetedContentChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
