package Windows.Security.Credentials

import Windows.Security.Credentials.IWebAccountFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebAccount.ABI::class)
@Signature("rc(Windows.Security.Credentials.WebAccount;{69473eb2-8031-49be-80bb-96cb46d99aba})")
@WinRTByReference(brClass = WebAccount.ByReference::class)
public class WebAccount(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebAccount.WithDefault, IWebAccount2.WithDefault, IWinRTObject {
  private val __567665609_Interface: IWebAccount.WithDefault by lazy {
    as_567665609()
  }


  private val __417764745_Interface: IWebAccount2.WithDefault by lazy {
    as_417764745()
  }


  public override val __567665609_Ptr: JNAPointer? by lazy {
    __567665609_Interface.__567665609_Ptr
  }


  public override val __417764745_Ptr: JNAPointer? by lazy {
    __417764745_Interface.__417764745_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__567665609_Interface, __417764745_Interface)

  public constructor(
    webAccountProvider: WebAccountProvider,
    userName: String,
    state: WebAccountState
  ) : this(ABI.activate(webAccountProvider, userName, state))

  private fun as_567665609(): IWebAccount.WithDefault {
    if(pointer == NULL) {
      return(IWebAccount.ABI.makeIWebAccount(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccount>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccount.ABI.makeIWebAccount(ref.value))
  }

  private fun as_417764745(): IWebAccount2.WithDefault {
    if(pointer == NULL) {
      return(IWebAccount2.ABI.makeIWebAccount2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebAccount2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebAccount2.ABI.makeIWebAccount2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WebAccount> {
    public override fun getValue() = WebAccount(pointer.getPointer(0))

    public fun setValue(value: WebAccount): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebAccount, MemoryAddress> {
    public val IWebAccountFactory_Instance: IWebAccountFactory by lazy {
      createIWebAccountFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWebAccountFactory(): IWebAccountFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.WebAccount".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWebAccountFactory.ABI.makeIWebAccountFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      webAccountProvider: WebAccountProvider,
      userName: String,
      state: WebAccountState
    ): JNAPointer? = IWebAccountFactory_Instance.CreateWebAccount(webAccountProvider, userName,
        state)?.pointer

    public override fun fromNative(segment: MemoryAddress): WebAccount {
      val address = segment.toRawLongValue()
      return WebAccount(Pointer(address))
    }

    public override fun toNative(obj: WebAccount): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
