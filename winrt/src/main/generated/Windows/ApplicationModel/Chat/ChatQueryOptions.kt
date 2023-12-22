package Windows.ApplicationModel.Chat

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(ChatQueryOptions.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.ChatQueryOptions;{2fd364a6-bf36-42f7-b7e7-923c0aabfe16})")
@WinRTByReference(brClass = ChatQueryOptions.ByReference::class)
public class ChatQueryOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IChatQueryOptions.WithDefault, IWinRTObject {
  private val __525563979_Interface: IChatQueryOptions.WithDefault by lazy {
    as_525563979()
  }


  public override val __525563979_Ptr: JNAPointer? by lazy {
    __525563979_Interface.__525563979_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__525563979_Interface)

  public constructor() : this(ABI.activate())

  private fun as_525563979(): IChatQueryOptions.WithDefault {
    if(pointer == NULL) {
      return(IChatQueryOptions.ABI.makeIChatQueryOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IChatQueryOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IChatQueryOptions.ABI.makeIChatQueryOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ChatQueryOptions> {
    public override fun getValue() = ChatQueryOptions(pointer.getPointer(0))

    public fun setValue(value: ChatQueryOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ChatQueryOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Chat.ChatQueryOptions".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): ChatQueryOptions {
      val address = segment.toRawLongValue()
      return ChatQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: ChatQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
