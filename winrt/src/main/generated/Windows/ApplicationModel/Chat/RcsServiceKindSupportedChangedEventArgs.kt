package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsServiceKindSupportedChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsServiceKindSupportedChangedEventArgs;{f47ea244-e783-4866-b3a7-4e5ccf023070})")
@WinRTByReference(brClass = RcsServiceKindSupportedChangedEventArgs.ByReference::class)
public class RcsServiceKindSupportedChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsServiceKindSupportedChangedEventArgs.WithDefault, IWinRTObject {
  private val __821035197_Interface: IRcsServiceKindSupportedChangedEventArgs.WithDefault by lazy {
    as_821035197()
  }


  public override val __821035197_Ptr: JNAPointer? by lazy {
    __821035197_Interface.__821035197_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__821035197_Interface)

  private fun as_821035197(): IRcsServiceKindSupportedChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRcsServiceKindSupportedChangedEventArgs.ABI.makeIRcsServiceKindSupportedChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsServiceKindSupportedChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsServiceKindSupportedChangedEventArgs.ABI.makeIRcsServiceKindSupportedChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsServiceKindSupportedChangedEventArgs> {
    public override fun getValue() = RcsServiceKindSupportedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RcsServiceKindSupportedChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsServiceKindSupportedChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RcsServiceKindSupportedChangedEventArgs {
      val address = segment.toRawLongValue()
      return RcsServiceKindSupportedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RcsServiceKindSupportedChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
